package mage.cards.h;

import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class HastyRetreat extends CardImpl {
    public HastyRetreat(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{U}");
        this.getSpellAbility().addEffect(new ReturnToHandTargetEffect());
        this.getSpellAbility().addTarget(new TargetControlledCreaturePermanent(0, 1));
        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));
    }


    public HastyRetreat(final HastyRetreat card) {
        super(card);
    }

    @Override
    public HastyRetreat copy() {
        return new HastyRetreat(this);
    }
}

