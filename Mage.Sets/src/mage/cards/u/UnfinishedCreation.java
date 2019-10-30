package mage.cards.u;

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
public final class UnfinishedCreation extends CardImpl {

    public UnfinishedCreation(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{R/G}{R/G}");
        this.subtype.add(SubType.ELEMENTAL);
        this.power = new MageInt(5);
        this.toughness = new MageInt(4);
    }

    public UnfinishedCreation(final UnfinishedCreation card) { super(card); }

    @Override
    public UnfinishedCreation copy() { return new UnfinishedCreation(this); }
}
