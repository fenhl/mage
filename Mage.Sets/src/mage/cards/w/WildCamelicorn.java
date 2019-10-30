package mage.cards.w;

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
public final class WildCamelicorn extends CardImpl {

    public WildCamelicorn(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{G}");
        this.subtype.add(SubType.CAMEL);
        this.subtype.add(SubType.UNICORN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);
    }

    public WildCamelicorn(final WildCamelicorn card) { super(card); }

    @Override
    public WildCamelicorn copy() { return new WildCamelicorn(this); }
}
