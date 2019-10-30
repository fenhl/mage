package mage.cards.z;

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
public final class ZebraBehemoth extends CardImpl {

    public ZebraBehemoth(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{R}");
        this.subtype.add(SubType.HORSE);
        this.subtype.add(SubType.BEAST);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public ZebraBehemoth(final ZebraBehemoth card) { super(card); }

    @Override
    public ZebraBehemoth copy() { return new ZebraBehemoth(this); }
}
