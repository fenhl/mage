
package mage.cards.a;

import java.util.UUID;

import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author LevelX2
 */
public final class AerialShootout extends CardImpl {

    public AerialShootout(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{U}");


        // Target creature gets +1/+1 and gains flying and first strike until end of turn.
        getSpellAbility().addEffect(new BoostTargetEffect(1,1, Duration.EndOfTurn));
        getSpellAbility().addEffect(new GainAbilityTargetEffect(FlyingAbility.getInstance(), Duration.EndOfTurn));
        getSpellAbility().addEffect(new UntapTargetEffect());
        getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    public AerialShootout(final AerialShootout card) {
        super(card);
    }

    @Override
    public AerialShootout copy() {
        return new AerialShootout(this);
    }
}
