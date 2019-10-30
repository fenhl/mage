package mage.cards.s;

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
public final class SavageHippo extends CardImpl {

    public SavageHippo(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{G}");
        this.subtype.add(SubType.HIPPO);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public SavageHippo(final SavageHippo card) { super(card); }

    @Override
    public SavageHippo copy() { return new SavageHippo(this); }
}
