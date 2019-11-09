package mage.abilities.keyword;

import java.util.UUID;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.SpecialAction;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.AlternateManaPaymentAbility;
import mage.abilities.costs.mana.ManaCost;
import mage.abilities.effects.OneShotEffect;
import mage.constants.AbilityType;
import mage.constants.ManaType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.stack.Spell;
import mage.players.ManaPool;
import mage.players.Player;
import mage.target.Target;
import mage.target.common.TargetControlledPermanent;

/**
 * @author Fenhl
 */
public class TortureAbility extends SimpleStaticAbility implements AlternateManaPaymentAbility {

    private static final FilterCreaturePermanent filterCreature = new FilterCreaturePermanent();

    public TortureAbility() {
        super(Zone.STACK, null);
        this.setRuleAtTheTop(true);
    }

    public TortureAbility(final TortureAbility ability) {
        super(ability);
    }

    @Override
    public TortureAbility copy() {
        return new TortureAbility(this);
    }

    @Override
    public void addSpecialAction(Ability source, Game game, ManaCost unpaid) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null && game.getBattlefield().contains(filterCreature, controller.getId(), 1, game)) {
            if (source.getAbilityType() == AbilityType.SPELL && unpaid.getMana().getGeneric() > 0) {
                SpecialAction specialAction = new TortureSpecialAction(unpaid);
                specialAction.setControllerId(source.getControllerId());
                specialAction.setSourceId(source.getSourceId());
                // create filter for possible creatures to torture
                FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent();
                Target target = new TargetControlledPermanent(1, unpaid.getMana().getGeneric(), filter, true);
                target.setTargetName("creature to torture");
                specialAction.addTarget(target);
                if (specialAction.canActivate(source.getControllerId(), game).canActivate()) {
                    game.getState().getSpecialActions().add(specialAction);
                }
            }
        }
    }

    @Override
    public String getRule() {
        return "Torture <i>(You can harm your creatures to cast this spell. Each creature you put a single -1/-1 counter on while casting this spell pays for {1}.)</i>";
    }
}

class TortureSpecialAction extends SpecialAction {

    public TortureSpecialAction(ManaCost unpaid) {
        super(Zone.ALL, true);
        setRuleVisible(false);
        this.addEffect(new TortureEffect(unpaid));
    }

    public TortureSpecialAction(final TortureSpecialAction ability) {
        super(ability);
    }

    @Override
    public TortureSpecialAction copy() {
        return new TortureSpecialAction(this);
    }
}

class TortureEffect extends OneShotEffect {

    private final ManaCost unpaid;

    public TortureEffect(ManaCost unpaid) {
        super(Outcome.Benefit);
        this.unpaid = unpaid;
        this.staticText = "Torture (You can harm your creatures to cast this spell. Each creature you put a single -1/-1 counter on while casting this spell pays for {1}.)";
    }

    public TortureEffect(final TortureEffect effect) {
        super(effect);
        this.unpaid = effect.unpaid;
    }

    @Override
    public TortureEffect copy() {
        return new TortureEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Spell spell = game.getStack().getSpell(source.getSourceId());
        if (controller != null && spell != null) {
            for (UUID creatureId : this.getTargetPointer().getTargets(game, source)) {
                Permanent perm = game.getPermanent(creatureId);
                if (perm == null) {
                    continue;
                }
                if (perm.addCounters(CounterType.M1M1.createInstance(), source, game, false)) {
                    ManaPool manaPool = controller.getManaPool();
                    manaPool.addMana(Mana.ColorlessMana(1), game, source);
                    manaPool.unlockManaType(ManaType.COLORLESS);
                    if (!game.isSimulation()) {
                        game.informPlayers("Torture: " + controller.getLogName() + " puts a -1/-1 counter on " + perm.getLogName() + " to pay {1}");
                    }
                    spell.setDoneActivatingManaAbilities(true);
                }

            }
            return true;
        }
        return false;
    }

}
