package mage.cards.q;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.common.DiesTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreatureOrPlaneswalkerPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.target.TargetPermanent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

public final class QueelagChaosWitch extends CardImpl {

    private static final FilterPermanent filter
            = new FilterCreatureOrPlaneswalkerPermanent("creature or planeswalker an opponent controls");

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public QueelagChaosWitch(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE},"{1}{R}{R}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.SPIDER, SubType.DEMON);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        this.addAbility(new QueelagAttackAbility());
        Ability ability = new DiesTriggeredAbility(new DamageTargetEffect(2));
        ability.addTarget(new TargetPermanent(filter));
        this.addAbility(ability);
    }

    private QueelagChaosWitch(final QueelagChaosWitch card) {
        super(card);
    }

    @Override
    public QueelagChaosWitch copy() {
        return new QueelagChaosWitch(this);
    }
}

class QueelagAttackAbility extends TriggeredAbilityImpl {

    QueelagAttackAbility() {
        super(Zone.BATTLEFIELD, null);
    }

    private QueelagAttackAbility(final QueelagAttackAbility ability) {
        super(ability);
    }

    @Override
    public QueelagAttackAbility copy() {
        return new QueelagAttackAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ATTACKER_DECLARED;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        if (this.getSourceId().equals(event.getSourceId())) {
            this.getEffects().clear();
            Effect effect = new DamageTargetEffect(1);
            effect.setTargetPointer(new FixedTarget(game.getCombat().getDefenderId(event.getSourceId()), game));
            this.addEffect(effect);
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever {this} attacks, it deals 1 damage to the player or permanent it's attacking.";
    }
}