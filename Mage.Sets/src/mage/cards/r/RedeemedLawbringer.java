package mage.cards.r;

import mage.MageInt;
import mage.abilities.keyword.RenownAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class RedeemedLawbringer extends CardImpl {

    public RedeemedLawbringer(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
        this.addAbility(new RenownAbility(1));
    }

    public RedeemedLawbringer(final RedeemedLawbringer card) {
        super(card);
    }

    @Override
    public RedeemedLawbringer copy() {
        return new RedeemedLawbringer(this);
    }
}
