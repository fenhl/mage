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
public final class ShimmerhideRhino extends CardImpl {

    public ShimmerhideRhino(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{G}{G}");
        this.subtype.add(SubType.RHINO);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    public ShimmerhideRhino(final ShimmerhideRhino card) { super(card); }

    @Override
    public ShimmerhideRhino copy() { return new ShimmerhideRhino(this); }
}
