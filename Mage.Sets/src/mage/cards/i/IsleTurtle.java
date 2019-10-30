package mage.cards.i;

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
public final class IsleTurtle extends CardImpl {

    public IsleTurtle(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{4}{U}");
        this.subtype.add(SubType.TURTLE);
        this.power = new MageInt(3);
        this.toughness = new MageInt(4);
    }

    public IsleTurtle(final IsleTurtle card) { super(card); }

    @Override
    public IsleTurtle copy() { return new IsleTurtle(this); }
}
