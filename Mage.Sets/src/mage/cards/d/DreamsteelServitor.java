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
public final class DreamsteelServitor extends CardImpl {

    public DreamsteelServitor(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ARTIFACT, CardType.CREATURE}, "{2}");
        this.subtype.add(SubType.CONSTRUCT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(3);
    }

    public DreamsteelServitor(final DreamsteelServitor card) { super(card); }

    @Override
    public DreamsteelServitor copy() { return new DreamsteelServitor(this); }
}
