package mage.cards.m;

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
public final class MutatedGaur extends CardImpl {

    public MutatedGaur(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{5}{G}{G}");
        this.subtype.add(SubType.OX);
        this.subtype.add(SubType.MUTANT);
        this.power = new MageInt(7);
        this.toughness = new MageInt(6);
    }

    public MutatedGaur(final MutatedGaur card) { super(card); }

    @Override
    public MutatedGaur copy() { return new MutatedGaur(this); }
}
