package mage.cards.z;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.PermanentsOnTheBattlefieldCondition;
import mage.abilities.decorator.ConditionalInterveningIfTriggeredAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.keyword.AdaptAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.filter.predicate.permanent.CounterPredicate;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class ZeganaUtopianSpeaker extends CardImpl {

    private static final FilterPermanent filter = new FilterControlledCreaturePermanent();
    private static final FilterPermanent filter2 = new FilterControlledCreaturePermanent();

    static {
        filter.add(new CounterPredicate(CounterType.P1P1));
        filter.add(AnotherPredicate.instance);
        filter2.add(new CounterPredicate(CounterType.P1P1));
    }

    public ZeganaUtopianSpeaker(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{G}{U}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.MERFOLK);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // When Zegana, Utopian Speaker enters the battlefield, if you control another creature with a +1/+1 counter on it, draw a card.
        this.addAbility(new ConditionalInterveningIfTriggeredAbility(
                new EntersBattlefieldTriggeredAbility(
                        new DrawCardSourceControllerEffect(1), false
                ), new PermanentsOnTheBattlefieldCondition(filter),
                "When {this} enters the battlefield, " +
                        "if you control another creature " +
                        "with a +1/+1 counter on it, draw a card."
        ));

        // {4}{G}{U}: Adapt 4.
        this.addAbility(new AdaptAbility(4, "{4}{G}{U}"));

        // Each creature you control with a +1/+1 counter on it has trample.
        this.addAbility(new SimpleStaticAbility(
                Zone.BATTLEFIELD,
                new GainAbilityAllEffect(
                        TrampleAbility.getInstance(), Duration.WhileOnBattlefield,
                        filter2, "Each creature you control with a +1/+1 counter on it has trample"
                )
        ));
    }

    public ZeganaUtopianSpeaker(final ZeganaUtopianSpeaker card) {
        super(card);
    }

    @Override
    public ZeganaUtopianSpeaker copy() {
        return new ZeganaUtopianSpeaker(this);
    }
}
