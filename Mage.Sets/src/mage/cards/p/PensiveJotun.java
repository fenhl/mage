package mage.cards.p;

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
public final class PensiveJotun extends CardImpl {

    public PensiveJotun(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{6}{G}");
        this.subtype.add(SubType.GIANT);
        this.power = new MageInt(7);
        this.toughness = new MageInt(5);
    }

    public PensiveJotun(final PensiveJotun card) { super(card); }

    @Override
    public PensiveJotun copy() { return new PensiveJotun(this); }
}
