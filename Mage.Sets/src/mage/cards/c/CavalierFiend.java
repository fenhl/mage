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
public final class CavalierFiend extends CardImpl {

    public CavalierFiend(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{R}");
        this.subtype.add(SubType.DEVIL);
        this.subtype.add(SubType.MINION);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    public CavalierFiend(final CavalierFiend card) { super(card); }

    @Override
    public CavalierFiend copy() { return new CavalierFiend(this); }
}
