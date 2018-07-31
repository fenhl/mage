package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AsEntersBattlefieldAbility;
import mage.abilities.common.EntersBattlefieldAllTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.LoseLifeTargetEffect;
import mage.abilities.effects.common.continuous.BecomesCreatureSourceEffect;
import mage.abilities.effects.common.discard.DiscardCardYouChooseTargetEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreatureCard;
import mage.filter.common.FilterLandPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.permanent.token.custom.CreatureToken;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class DevouringWendigo extends CardImpl {

    private static final FilterLandPermanent filter = new FilterLandPermanent("a land");

    static {
        filter.add(new ControllerPredicate(TargetController.OPPONENT));
    }

    public DevouringWendigo(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{2}{B}{B}");
        this.subtype.add(SubType.VAMPIRE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(4);

       Effect effect = new DiscardCardYouChooseTargetEffect(new FilterCreatureCard());
       power
    }

    public DadgumVermints(final DadgumVermints card) {
        super(card);
    }

    @Override
    public DadgumVermints copy() {
        return new DadgumVermints(this);
    }
}

public class DevouringWengdoEffect extends OneShotEffect{

}