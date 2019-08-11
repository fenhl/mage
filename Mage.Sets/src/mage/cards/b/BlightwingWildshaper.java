package mage.cards.b;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.BecomesCreatureSourceEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class BlightwingWildshaper extends CardImpl {

    public BlightwingWildshaper(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.DRUID);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        Effect becomeAnOxEffect = new BecomesCreatureSourceEffect(
                new CreatureToken(1, 2, "Bird with base power and toughness 1/2, flying and deathtouch")
                        .withColor("B")
                        .withSubType(SubType.BIRD)
                        .withAbility(FlyingAbility.getInstance())
                        .withAbility(DeathtouchAbility.getInstance()),
                        "", Duration.EndOfTurn);

        Ability sacredhoofWildshaperAbility = new SimpleActivatedAbility(Zone.BATTLEFIELD, becomeAnOxEffect, new ManaCostsImpl("{B}"));
        this.addAbility(sacredhoofWildshaperAbility);
    }

    public BlightwingWildshaper(final BlightwingWildshaper card) {
        super(card);
    }

    @Override
    public BlightwingWildshaper copy() {
        return new BlightwingWildshaper(this);
    }
}
