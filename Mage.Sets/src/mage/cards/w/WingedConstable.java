package mage.cards.w;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BecomesRenownedSourceTriggeredAbility;
import mage.abilities.common.LeavesBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ExileTargetForSourceEffect;
import mage.abilities.effects.common.ReturnFromExileForSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.RenownAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class WingedConstable extends CardImpl {

    public WingedConstable(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{1}{W}{W}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);
        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new RenownAbility(1));

        // When Winged Constable becomes renowned, exile target creature
        Ability ability1 = new BecomesRenownedSourceTriggeredAbility(new ExileTargetForSourceEffect(), false);
        ability1.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability1);

        // When Winged Constable leaves the battlefield, return the exiled card to the battlefield under its owner's control.
        Ability ability2 = new LeavesBattlefieldTriggeredAbility(new ReturnFromExileForSourceEffect(Zone.BATTLEFIELD), false);
        this.addAbility(ability2);

    }

    public WingedConstable(final WingedConstable card) {
        super(card);
    }

    @Override
    public WingedConstable copy() {
        return new WingedConstable(this);
    }
}
