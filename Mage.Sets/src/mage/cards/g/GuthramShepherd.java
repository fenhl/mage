package mage.cards.g;

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
public final class GuthramShepherd extends CardImpl {

    public GuthramShepherd(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.MINION);
        this.power = new MageInt(1);
        this.toughness = new MageInt(4);
    }

    public GuthramShepherd(final GuthramShepherd card) { super(card); }

    @Override
    public GuthramShepherd copy() { return new GuthramShepherd(this); }
}
