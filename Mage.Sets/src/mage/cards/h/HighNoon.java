package mage.cards.h;

import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.PutIntoGraveFromBattlefieldAllTriggeredAbility;
import mage.abilities.common.SacrificeSourceTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.effects.common.SacrificeSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.d.DuelingGrounds;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.filter.common.FilterAttackingOrBlockingCreature;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.permanent.AttackingPredicate;
import mage.filter.predicate.permanent.BlockingPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.game.permanent.Permanent;
import mage.watchers.common.AttackedThisTurnWatcher;
import mage.watchers.common.BlockedThisTurnWatcher;

import java.util.Set;
import java.util.UUID;

public final class HighNoon extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterAttackingOrBlockingCreature("an attacking or blocking creature");


    public HighNoon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{W}");

        // No more than one creature can attack each turn.
        this.addAbility(
                new SimpleStaticAbility(Zone.BATTLEFIELD, new NoMoreThanOneCreatureCanAttackEachTurnEffect()),
                new AttackedThisTurnWatcher());

        // No more than one creature can block each turn.
        this.addAbility(
                new SimpleStaticAbility(Zone.BATTLEFIELD, new NoMoreThanOneCreatureCanBlockEachTurnEffect()),
                new BlockedThisTurnWatcher());
        //When an attacking or blocking creature dies, sacrifice High Noon.
        //this.addAbility(new HighNoonTriggeredAbility());
        this.addAbility(new PutIntoGraveFromBattlefieldAllTriggeredAbility(new SacrificeSourceEffect(), false, filter, false, false));
    }
    public HighNoon(final mage.cards.h.HighNoon card) {
        super(card);
    }

    @Override
    public mage.cards.h.HighNoon copy() {
        return new mage.cards.h.HighNoon(this);
    }
}

class NoMoreThanOneCreatureCanAttackEachTurnEffect extends RestrictionEffect {

    public NoMoreThanOneCreatureCanAttackEachTurnEffect() {
        super(Duration.WhileOnBattlefield);
    }

    public NoMoreThanOneCreatureCanAttackEachTurnEffect(final NoMoreThanOneCreatureCanAttackEachTurnEffect effect) {
        super(effect);
        this.staticText = "No more than one creature can attack each turn";
    }

    @Override
    public ContinuousEffect copy() {
        return new NoMoreThanOneCreatureCanAttackEachTurnEffect(this);
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return true;
    }

    @Override
    public boolean canAttack(Permanent attacker, UUID defenderId, Ability source, Game game, boolean canUseChooseDialogs) {
        if (!game.getCombat().getAttackers().isEmpty()) {
            return false;
        }
        AttackedThisTurnWatcher watcher = game.getState().getWatcher(AttackedThisTurnWatcher.class);
        if (watcher == null) {
            return false;
        }
        Set<MageObjectReference> attackedThisTurnCreatures = watcher.getAttackedThisTurnCreatures();
        return attackedThisTurnCreatures.isEmpty()
                || (attackedThisTurnCreatures.size() == 1 && attackedThisTurnCreatures.contains(new MageObjectReference(attacker, game)));
    }

}

class NoMoreThanOneCreatureCanBlockEachTurnEffect extends RestrictionEffect {

    public NoMoreThanOneCreatureCanBlockEachTurnEffect() {
        super(Duration.WhileOnBattlefield);
        this.staticText = "No more than one creature can block each turn";
    }

    public NoMoreThanOneCreatureCanBlockEachTurnEffect(final NoMoreThanOneCreatureCanBlockEachTurnEffect effect) {
        super(effect);
    }

    @Override
    public ContinuousEffect copy() {
        return new NoMoreThanOneCreatureCanBlockEachTurnEffect(this);
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return true;
    }

    @Override
    public boolean canBlock(Permanent attacker, Permanent blocker, Ability source, Game game, boolean canUseChooseDialogs) {
        if (!game.getCombat().getBlockers().isEmpty()) {
            return false;
        }
        BlockedThisTurnWatcher watcher = game.getState().getWatcher(BlockedThisTurnWatcher.class);
        if (watcher == null) {
            return false;
        }
        Set<MageObjectReference> blockedThisTurnCreatures = watcher.getBlockedThisTurnCreatures();
        MageObjectReference blockerReference = new MageObjectReference(blocker.getId(), blocker.getZoneChangeCounter(game), game);
        return blockedThisTurnCreatures.isEmpty()
                || (blockedThisTurnCreatures.size() == 1 && blockedThisTurnCreatures.contains(blockerReference));
    }

}

/*class HighNoonTriggeredAbility extends TriggeredAbilityImpl {

    public HighNoonTriggeredAbility() {
        super(Zone.BATTLEFIELD, new SacrificeSourceEffect(), false);
    }

    public HighNoonTriggeredAbility(final mage.cards.h.HighNoonTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public mage.cards.h.HighNoonTriggeredAbility copy() {
        return new mage.cards.h.HighNoonTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
        if (zEvent.getFromZone() == Zone.BATTLEFIELD
                && zEvent.getToZone() == Zone.GRAVEYARD) {
            if (zEvent.getTarget().isCreature()){
                if (zEvent.getTarget().isAttacking() || (zEvent.getTarget().getBlocking() > 0)) {
                return true;
            }}
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever an attacking or blocking creature dies, "
                + "sacrifice {this}. ";
    }
}
*/
