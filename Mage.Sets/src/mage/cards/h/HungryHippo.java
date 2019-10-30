package mage.cards.h;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class HungryHippo extends CardImpl {

    public HungryHippo(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{4}{U}");
        this.subtype.add(SubType.HIPPO);
        this.power = new MageInt(4);
        this.toughness = new MageInt(5);
    }

    public HungryHippo(final HungryHippo card) { super(card); }

    @Override
    public HungryHippo copy() { return new HungryHippo(this); }
}
