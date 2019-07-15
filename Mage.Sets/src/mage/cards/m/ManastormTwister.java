package mage.cards.m;

import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.ReflexAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.common.TargetOpponentsCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class ManastormTwister extends CardImpl {
    public ManastormTwister(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{U}{U}");
        this.getSpellAbility().addEffect(new ReturnToHandTargetEffect());
        this.getSpellAbility().addTarget(new TargetOpponentsCreaturePermanent(0, 2));
        this.addAbility(new ReflexAbility(this, "{4}{U}{U}"));
    }


    public ManastormTwister(final ManastormTwister card) {
        super(card);
    }

    @Override
    public ManastormTwister copy() {
        return new ManastormTwister(this);
    }
}

