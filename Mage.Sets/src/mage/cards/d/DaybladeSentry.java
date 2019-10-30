package mage.cards.d;

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
public final class DaybladeSentry extends CardImpl {

    public DaybladeSentry(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public DaybladeSentry(final DaybladeSentry card) { super(card); }

    @Override
    public DaybladeSentry copy() { return new DaybladeSentry(this); }
}
