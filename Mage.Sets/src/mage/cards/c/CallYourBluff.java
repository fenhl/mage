
package mage.cards.c;

import java.util.UUID;

import mage.abilities.dynamicvalue.common.LongestStraight;
import mage.abilities.dynamicvalue.common.ManacostVariableValue;
import mage.abilities.effects.common.CounterUnlessPaysEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.TargetSpell;

/**
 *
 * @author fireshoes
 */
public final class CallYourBluff extends CardImpl {

    public CallYourBluff(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{1}{U}");

        // Counter target spell unless its controller pays {X}, where X is your longest Straight.
        this.getSpellAbility().addEffect(new CounterUnlessPaysEffect(new LongestStraight()));
        this.getSpellAbility().addTarget(new TargetSpell());
    }

    public CallYourBluff(final CallYourBluff card) {
        super(card);
    }

    @Override
    public CallYourBluff copy() {
        return new CallYourBluff(this);
    }
}
