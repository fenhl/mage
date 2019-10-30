package mage.cards.t;

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
public final class TempleRats extends CardImpl {

    public TempleRats(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{B}");
        this.subtype.add(SubType.RAT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public TempleRats(final TempleRats card) { super(card); }

    @Override
    public TempleRats copy() { return new TempleRats(this); }
}
