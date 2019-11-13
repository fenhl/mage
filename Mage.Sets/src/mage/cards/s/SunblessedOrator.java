package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldControlledTriggeredAbility;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.keyword.LifelinkAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.AnotherPredicate;

import java.util.UUID;

public final class SunblessedOrator extends CardImpl {

    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("another");

    static{
        filter.add(AnotherPredicate.instance);
    }

    public SunblessedOrator(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}{R}");

        this.subtype.add(SubType.HUMAN, SubType.CLERIC);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(LifelinkAbility.getInstance());
        this.addAbility(new EntersBattlefieldControlledTriggeredAbility(
                new DamagePlayersEffect(1, TargetController.OPPONENT), filter));
    }

    public SunblessedOrator(final SunblessedOrator card) {
        super(card);
    }

    @Override
    public SunblessedOrator copy() {
        return new SunblessedOrator(this);
    }
}
