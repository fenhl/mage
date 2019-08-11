package mage.cards.c;

import mage.MageInt;
import mage.abilities.common.DealsCombatDamageToAPlayerTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.DiscardCardCost;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.combat.CantBeBlockedSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;


/**
 *
 *
 * @author Eike Peace
 */
public final class CareerCriminal extends CardImpl {

    public CareerCriminal(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);


        this.addAbility(new DealsCombatDamageToAPlayerTriggeredAbility(new DrawCardSourceControllerEffect(1), false));
        this.addAbility(new SimpleActivatedAbility(new CantBeBlockedSourceEffect(Duration.EndOfTurn), new DiscardCardCost()));
    }

    public CareerCriminal(final CareerCriminal card) {
        super(card);
    }

    @Override
    public CareerCriminal copy() {
        return new CareerCriminal(this);
    }
}
