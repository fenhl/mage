package mage.cards.c;

import mage.abilities.Ability;
import mage.abilities.costs.mana.ManaCostImpl;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.abilities.keyword.ReflexAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class ConjureFrost extends CardImpl {
    public ConjureFrost(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{U}");

        this.getSpellAbility().addEffect(new TapTargetEffect());
        this.getSpellAbility().addTarget(new TargetCreaturePermanent(0, 2));
        this.getSpellAbility().addEffect(new DontUntapInControllersNextUntapStepTargetEffect("Those creatures"));

        this.addAbility(new ReflexAbility(this, "{3}{U}"));
    }

    public ConjureFrost(final ConjureFrost card) {
        super(card);
    }

    @Override
    public ConjureFrost copy() {
        return new ConjureFrost(this);
    }
}
