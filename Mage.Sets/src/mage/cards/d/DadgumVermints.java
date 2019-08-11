package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAllTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.abilities.effects.common.continuous.BecomesCreatureSourceEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterLandPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class DadgumVermints extends CardImpl {

    private static final FilterLandPermanent filter = new FilterLandPermanent("a land");

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public DadgumVermints(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.SQUIRREL);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        Effect effect = new LoseLifeTargetEffect(1);
        effect.setText("that player loses 1 life");
        Ability ability = new EntersBattlefieldAllTriggeredAbility(Zone.BATTLEFIELD, effect, filter, false, SetTargetPointer.PLAYER, "");
        this.addAbility(ability);
            }

    public DadgumVermints(final DadgumVermints card) {
        super(card);
    }

    @Override
    public DadgumVermints copy() {
        return new DadgumVermints(this);
    }
}
