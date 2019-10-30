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
public final class PhantasmalTriad extends CardImpl {

    public PhantasmalTriad(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{W/U}{W/U}");
        this.subtype.add(SubType.SPIRIT);
        this.subtype.add(SubType.BARD);
        this.power = new MageInt(3);
        this.toughness = new MageInt(5);
    }

    public PhantasmalTriad(final PhantasmalTriad card) { super(card); }

    @Override
    public PhantasmalTriad copy() { return new PhantasmalTriad(this); }
}
