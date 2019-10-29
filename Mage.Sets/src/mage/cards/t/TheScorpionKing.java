package mage.cards.t;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.keyword.DeathtouchAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.AbilityPredicate;

import java.util.UUID;

/**
 *
 * @author Eike_Peace
 */
public final class TheScorpionKing extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creatures you control with deathtouch");

    static {
        filter.add(new AbilityPredicate(DeathtouchAbility.class));
    }

    public TheScorpionKing(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}{G}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN, SubType.SCORPION);
        this.power = new MageInt(1);
        this.toughness = new MageInt(4);

        //Deathtouch
        this.addAbility(DeathtouchAbility.getInstance());

        //Other creatures you control with deathtouch get +1/+4.
        this.addAbility(new SimpleStaticAbility(new BoostControlledEffect(1, 4, Duration.WhileOnBattlefield, filter, true)));
    }

    private TheScorpionKing(final TheScorpionKing card) {
        super(card);
    }

    @Override
    public TheScorpionKing copy() {
        return new TheScorpionKing(this);
    }
}