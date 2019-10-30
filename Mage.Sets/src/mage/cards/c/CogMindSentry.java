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
public final class CogMindSentry extends CardImpl {

    public CogMindSentry(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ARTIFACT, CardType.CREATURE}, "{2}");
        this.subtype.add(SubType.CONSTRUCT);
        this.subtype.add(SubType.SCOUT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);
    }

    public CogMindSentry(final CogMindSentry card) { super(card); }

    @Override
    public CogMindSentry copy() { return new CogMindSentry(this); }
}
