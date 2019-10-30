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
public final class ShellbackDeputy extends CardImpl {

    public ShellbackDeputy(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.TURTLE);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(4);
    }

    public ShellbackDeputy(final ShellbackDeputy card) { super(card); }

    @Override
    public ShellbackDeputy copy() { return new ShellbackDeputy(this); }
}
