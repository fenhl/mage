package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.effects.common.ReturnFromGraveyardToHandTargetEffect;
import mage.abilities.effects.common.ReturnToHandFromGraveyardAllEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.FlashAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.ReflexAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.FilterCard;
import mage.filter.predicate.mageobject.AbilityPredicate;
import mage.target.common.TargetCardInGraveyard;
import mage.target.common.TargetCardInYourGraveyard;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class AvenDeputy extends CardImpl {

    private static final FilterCard filter = new FilterCard("card with Reflex");

    static {
        filter.add(new AbilityPredicate(ReflexAbility.class));
    }

    public AvenDeputy(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        this.addAbility(FlashAbility.getInstance());
        this.addAbility(FlyingAbility.getInstance());
        Ability ability = new EntersBattlefieldAbility(new ReturnFromGraveyardToHandTargetEffect(),false);
        ability.addTarget(new TargetCardInYourGraveyard(filter));
        this.addAbility(ability);
    }

    public AvenDeputy(final AvenDeputy card) {
        super(card);
    }

    @Override
    public AvenDeputy copy() {
        return new AvenDeputy(this);
    }
}
