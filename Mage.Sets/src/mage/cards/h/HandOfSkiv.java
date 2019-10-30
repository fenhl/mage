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
public final class HandOfSkiv extends CardImpl {

    public HandOfSkiv(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{B/R}");
        this.subtype.add(SubType.ROGUE);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public HandOfSkiv(final HandOfSkiv card) { super(card); }

    @Override
    public HandOfSkiv copy() { return new HandOfSkiv(this); }
}
