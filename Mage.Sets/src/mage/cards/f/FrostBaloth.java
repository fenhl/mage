package mage.cards.f;

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
public final class FrostBaloth extends CardImpl {

    public FrostBaloth(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.BEAST);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public FrostBaloth(final FrostBaloth card) { super(card); }

    @Override
    public FrostBaloth copy() { return new FrostBaloth(this); }
}
