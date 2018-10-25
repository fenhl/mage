package mage.cards.a;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.dynamicvalue.common.LongestStraight;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.counters.CounterType;

/**
 *
 * @author EikePeace
 */
import java.util.UUID;

public final class AvenDealer extends CardImpl {

    public AvenDealer(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}{U}");
        this.power = new MageInt(0);
        this.toughness = new MageInt(1);

        Effect effect = new AddCountersSourceEffect(CounterType.P1P1.createInstance(), new LongestStraight(), true);
        this.addAbility(new EntersBattlefieldAbility(effect));
    }

    public AvenDealer(final AvenDealer card) {
        super(card);
    }

    @Override
    public AvenDealer copy() {
        return new AvenDealer(this);
    }
}
