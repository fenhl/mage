package mage.cards.o;

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
public final class OperaGhost extends CardImpl {

    public OperaGhost(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{U/B}");
        this.subtype.add(SubType.SPIRIT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(4);
    }

    public OperaGhost(final OperaGhost card) { super(card); }

    @Override
    public OperaGhost copy() { return new OperaGhost(this); }
}
