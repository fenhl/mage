package mage.cards.r;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class RoamingBuffalo extends CardImpl {

    public RoamingBuffalo(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.OX);
        this.power = new MageInt(2);
        this.toughness = new MageInt(4);
    }

    public RoamingBuffalo(final RoamingBuffalo card) {
        super(card);
    }

    @Override
    public RoamingBuffalo copy() {
        return new RoamingBuffalo(this);
    }
}
