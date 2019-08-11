package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.BecomesCreatureSourceEffect;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

public final class SacredhoofWildshaper extends CardImpl {

    public SacredhoofWildshaper(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.DRUID);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        Effect becomeAnOxEffect = new BecomesCreatureSourceEffect(
                new CreatureToken(2, 5, "Ox with base power and toughness 2/5 and lifelink")
                        .withColor("W")
                        .withSubType(SubType.OX)
                        .withAbility(LifelinkAbility.getInstance()),
                "", Duration.EndOfTurn);

        Ability sacredhoofWildshaperAbility = new SimpleActivatedAbility(Zone.BATTLEFIELD, becomeAnOxEffect, new ManaCostsImpl("{2}{W}"));
        this.addAbility(sacredhoofWildshaperAbility);
    }

    public SacredhoofWildshaper(final SacredhoofWildshaper card) {
        super(card);
    }

    @Override
    public SacredhoofWildshaper copy() {
        return new SacredhoofWildshaper(this);
    }
}
