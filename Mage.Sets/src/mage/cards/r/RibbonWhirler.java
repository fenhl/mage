package mage.cards.r;

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
public final class RibbonWhirler extends CardImpl {

    public RibbonWhirler(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{R/W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);
    }

    public RibbonWhirler(final RibbonWhirler card) { super(card); }

    @Override
    public RibbonWhirler copy() { return new RibbonWhirler(this); }
}
