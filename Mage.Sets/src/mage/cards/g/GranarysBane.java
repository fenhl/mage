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
public final class GranarysBane extends CardImpl {

    public GranarysBane(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.RAT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(3);
    }

    public GranarysBane(final GranarysBane card) { super(card); }

    @Override
    public GranarysBane copy() { return new GranarysBane(this); }
}
