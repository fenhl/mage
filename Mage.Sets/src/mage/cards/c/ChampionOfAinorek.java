package mage.cards.c;

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
public final class ChampionOfAinorek extends CardImpl {

    public ChampionOfAinorek(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HOUND);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
    }

    public ChampionOfAinorek(final ChampionOfAinorek card) { super(card); }

    @Override
    public ChampionOfAinorek copy() { return new ChampionOfAinorek(this); }
}
