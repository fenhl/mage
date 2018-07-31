package mage.cards.t;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.filter.common.FilterArtifactSpell;

import java.util.UUID;

public final class TrinketPeddler extends CardImpl {

    public TrinketPeddler(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ARTIFICER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        Ability ability = new SpellCastControllerTriggeredAbility(
                new AddCountersSourceEffect(CounterType.P1P1.createInstance(1)),
                new FilterArtifactSpell("an artifact spell"),
                false);

        this.addAbility(ability);
    }

    public TrinketPeddler(final TrinketPeddler card) {
        super(card);
    }

    @Override
    public TrinketPeddler copy() {
        return new TrinketPeddler(this);
    }
}
