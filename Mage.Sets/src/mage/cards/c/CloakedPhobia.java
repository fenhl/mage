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
public final class CloakedPhobia extends CardImpl {

    public CloakedPhobia(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.NIGHTMARE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    public CloakedPhobia(final CloakedPhobia card) { super(card); }

    @Override
    public CloakedPhobia copy() { return new CloakedPhobia(this); }
}
