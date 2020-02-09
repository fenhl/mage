
package mage.cards.a;

import java.util.UUID;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.TargetController;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author North
 */
public final class ActOfAggression extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature an opponent controls");

    static {
        filter.add(TargetController.OPPONENT.getControllerPredicate());
    }

    public ActOfAggression(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{3}{R/P}{R/P}");
        this.getSpellAbility().addTarget(new TargetCreaturePermanent(filter));
        this.getSpellAbility().addEffect(new GainControlTargetEffect(Duration.EndOfTurn));
        this.getSpellAbility().addEffect(new UntapTargetEffect().setText("Untap that creature"));
        this.getSpellAbility().addEffect(new GainAbilityTargetEffect(HasteAbility.getInstance(), Duration.EndOfTurn).setText("It gains haste until end of turn."));
    }

    public ActOfAggression(final ActOfAggression card) {
        super(card);
    }

    @Override
    public ActOfAggression copy() {
        return new ActOfAggression(this);
    }
}
