
package mage.cards.f;


import java.util.UUID;

import mage.abilities.Mode;
import mage.abilities.effects.common.DontUntapInControllersNextUntapStepTargetEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.filter.FilterSpell;
import mage.filter.common.FilterInstantOrSorcerySpell;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.target.TargetStackObject;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author EikePeace
 */

public final class ForceStasis extends CardImpl {

    private static final FilterSpell filter = new FilterInstantOrSorcerySpell("instant or sorcery card you don't control");

    static {
        filter.add(new ControllerPredicate(TargetController.NOT_YOU));
    }

    public ForceStasis(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{1}{U}");

        // Choose one &mdash; Tap target creature. It doesn't untap during it's controllers next untap step.;
        getSpellAbility().addEffect(new TapTargetEffect());
        getSpellAbility().addEffect(new DontUntapInControllersNextUntapStepTargetEffect("It"));
        getSpellAbility().addTarget(new TargetCreaturePermanent());

        //Return target instant or sorcery spell you don't control to it's Owner's hand.
        Mode mode = new Mode();
        mode.getEffects().add(new ReturnToHandTargetEffect());
        mode.getTargets().add(new TargetStackObject(filter));
        this.getSpellAbility().addMode(mode);

    }
    public ForceStasis(final ForceStasis card) {
        super(card);
    }

    @Override
    public ForceStasis copy() {
        return new ForceStasis(this);
    }
}
