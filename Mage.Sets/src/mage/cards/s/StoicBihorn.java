package mage.cards.s;

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
public final class StoicBihorn extends CardImpl {

    public StoicBihorn(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{G/W}{G/W}");
        this.subtype.add(SubType.RHINO);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public StoicBihorn(final StoicBihorn card) { super(card); }

    @Override
    public StoicBihorn copy() { return new StoicBihorn(this); }
}
