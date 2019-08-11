package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class SheriffsSteed extends CardImpl {

    public SheriffsSteed(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[]{CardType.CREATURE}, "{1}{W}{W}");
        this.subtype.add(SubType.GRIFFIN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
        this.addAbility(FlyingAbility.getInstance());

        Ability SheriffsSteedAbility = new EntersBattlefieldTriggeredAbility(new GainAbilityTargetEffect(FlyingAbility.getInstance(), Duration.EndOfTurn));
        SheriffsSteedAbility.addTarget(new TargetCreaturePermanent());

        this.addAbility(SheriffsSteedAbility);
    }

    public SheriffsSteed(final SheriffsSteed card) {
        super(card);
    }

    @Override
    public SheriffsSteed copy() {
        return new SheriffsSteed(this);
    }
}