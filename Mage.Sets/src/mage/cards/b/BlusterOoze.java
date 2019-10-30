package mage.cards.b;

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
public final class BlusterOoze extends CardImpl {

    public BlusterOoze(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{B}");
        this.subtype.add(SubType.OOZE);
        this.power = new MageInt(0);
        this.toughness = new MageInt(4);
    }

    public BlusterOoze(final BlusterOoze card) { super(card); }

    @Override
    public BlusterOoze copy() { return new BlusterOoze(this); }
}
