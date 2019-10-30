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
public final class HysteriaMori extends CardImpl {

    public HysteriaMori(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{4}{R}");
        this.subtype.add(SubType.ELEMENTAL);
        this.power = new MageInt(7);
        this.toughness = new MageInt(1);
    }

    public HysteriaMori(final HysteriaMori card) { super(card); }

    @Override
    public HysteriaMori copy() { return new HysteriaMori(this); }
}
