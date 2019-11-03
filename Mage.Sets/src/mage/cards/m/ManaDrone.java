package mage.cards.m;

import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.BecomesCreatureSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.mana.AnyColorManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

/**
 *
 * @author Fenhl
 */
public final class ManaDrone extends CardImpl {

    public ManaDrone(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ARTIFACT}, "{3}");

        this.addAbility(new AnyColorManaAbility());

        // {1}: Mana Drone becomes a 1/1 Thopter artifact creature with flying until end of turn.
        Effect effect = new BecomesCreatureSourceEffect(new CreatureToken(1, 1, "1/1 Thopter artifact creature with flying")
                .withSubType(SubType.THOPTER)
                .withType(CardType.ARTIFACT)
                .withAbility(FlyingAbility.getInstance()),
                "", Duration.EndOfTurn);
        this.addAbility(new SimpleActivatedAbility(effect, new ManaCostsImpl("{1}")));
    }

    public ManaDrone(final ManaDrone card) { super(card); }

    @Override
    public ManaDrone copy() { return new ManaDrone(this); }
}
