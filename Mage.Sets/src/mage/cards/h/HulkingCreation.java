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
public final class HulkingCreation extends CardImpl {

    public HulkingCreation(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ARTIFACT, CardType.CREATURE}, "{3}");
        this.subtype.add(SubType.GOLEM);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public HulkingCreation(final HulkingCreation card) { super(card); }

    @Override
    public HulkingCreation copy() { return new HulkingCreation(this); }
}
