
package mage.cards.w;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.dynamicvalue.common.DomainValue;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Zone;

/**
 *
 * @author Loki
 */
public final class WanderingGoblins extends CardImpl {

    public WanderingGoblins(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{R}");
        this.subtype.add(SubType.GOBLIN);
        this.subtype.add(SubType.WARRIOR);

        this.power = new MageInt(0);
        this.toughness = new MageInt(3);

        // Domain - {3}: Wandering Goblins gets +1/+0 until end of turn for each basic land type among lands you control.
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new BoostSourceEffect(new DomainValue(), StaticValue.get(0), Duration.EndOfTurn), new GenericManaCost(3)));
    }

    public WanderingGoblins(final WanderingGoblins card) {
        super(card);
    }

    @Override
    public WanderingGoblins copy() {
        return new WanderingGoblins(this);
    }
}
