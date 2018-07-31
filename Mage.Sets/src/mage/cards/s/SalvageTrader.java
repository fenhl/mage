/**package mage.cards.s;


import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.ActivatedAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.ExchangeControlTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.g.GauntletsOfChaosFirstTarget;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

/**
 *
 * @author EikePeace
 */
/**
public final class SalvageTrader extends CardImpl {

    private static final String rule = "Tap: Exchange control of target artifact you control and target artifact an opponent controls with the same converted mana cost.";

    public SalvageTrader(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.CROLUTE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);


        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new ExchangeControlTargetEffect(Duration.EndOfGame, rule, false, true), new TapSourceCost());
        ability.addTarget(SalvageTraderFirstTarget());
        ability.addTarget(SalvageTraderSecondTarget());

    }
}

class SalvageTraderFirstTarget extends TargetControlledPermanent {

    public SalvageTraderFirstTarget() {
        super();
        this.filter = this.filter.copy();
        filter.add(new CardTypePredicate(CardType.ARTIFACT));
        setTargetName("artifact you control");
    }

    public SalvageTraderFirstTarget(final SalvageTraderFirstTarget target) {
        super(target);
    }

}*/