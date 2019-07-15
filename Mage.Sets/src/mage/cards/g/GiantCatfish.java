package mage.cards.g;

import mage.MageInt;
import mage.abilities.keyword.FlashAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class GiantCatfish extends CardImpl {
    public GiantCatfish(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.FISH);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        //Flash
        this.addAbility(FlashAbility.getInstance());
    }


    public GiantCatfish(final GiantCatfish card) {
        super(card);
    }

    @Override
    public GiantCatfish copy() {
        return new GiantCatfish(this);
    }
}

