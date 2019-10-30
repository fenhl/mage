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
public final class CitySentinel extends CardImpl {

    public CitySentinel(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ARTIFACT, CardType.CREATURE}, "{8}");
        this.subtype.add(SubType.CONSTRUCT);
        this.power = new MageInt(8);
        this.toughness = new MageInt(8);
    }

    public CitySentinel(final CitySentinel card) { super(card); }

    @Override
    public CitySentinel copy() { return new CitySentinel(this); }
}
