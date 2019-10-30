package mage.cards.c;

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
public final class CourtroomCustodians extends CardImpl {

    public CourtroomCustodians(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(5);
    }

    public CourtroomCustodians(final CourtroomCustodians card) { super(card); }

    @Override
    public CourtroomCustodians copy() { return new CourtroomCustodians(this); }
}
