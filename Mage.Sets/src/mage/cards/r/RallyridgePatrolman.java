package mage.cards.r;

import mage.MageInt;
import mage.abilities.keyword.RenownAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public final class RallyridgePatrolman extends CardImpl {

    public RallyridgePatrolman(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{3}{W}");
        this.subtype.add(SubType.CENTAUR);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
        this.addAbility(new RenownAbility(1));
    }

    public RallyridgePatrolman(final RallyridgePatrolman card) {
        super(card);
    }

    @Override
    public RallyridgePatrolman copy() {
        return new RallyridgePatrolman(this);
    }
}
