package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.condition.CompoundCondition;
import mage.abilities.condition.Condition;
import mage.abilities.condition.OrCondition;
import mage.abilities.condition.common.EnchantedTargetCondition;
import mage.abilities.condition.common.EquippedTargetCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class SignatureStrike extends CardImpl {

    public SignatureStrike(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.INSTANT}, "{W}");
        this.getSpellAbility().addEffect(new BoostTargetEffect(2,2, Duration.EndOfTurn));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());

        Condition hasAnyCounterCondition = new Condition() {
            @Override
            public boolean apply(Game game, Ability source) {
                Permanent target = game.getPermanent(source.getFirstTarget());
                if(target != null)
                    return !target.getCounters(game).isEmpty();

                return false;
            }
        };

        Effect secondEffect = new ConditionalOneShotEffect(new UntapTargetEffect(),
                new OrCondition(EnchantedTargetCondition.instance,
                                      new EquippedTargetCondition(),
                                      hasAnyCounterCondition
                                      ));
        this.getSpellAbility().addEffect(secondEffect);


    }


    public SignatureStrike(final SignatureStrike card) {
        super(card);
    }

    @Override
    public SignatureStrike copy() {
        return new SignatureStrike(this);
    }
}
