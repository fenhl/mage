package mage.cards.j;

import mage.MageInt;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.RevealLibraryPutIntoHandEffect;
import mage.abilities.effects.common.continuous.MaximumHandSizeControllerEffect;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreatureCard;

import java.util.UUID;

public final class JunmraWildSovereign extends CardImpl {

    public JunmraWildSovereign(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{R}{G}{W}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.CAT, SubType.AVATAR);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        this.addAbility(FirstStrikeAbility.getInstance());
        this.addAbility(new SimpleStaticAbility(new MaximumHandSizeControllerEffect(Integer.MAX_VALUE,
                Duration.WhileOnBattlefield, MaximumHandSizeControllerEffect.HandSizeModification.SET)));
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(Zone.BATTLEFIELD,
                new RevealLibraryPutIntoHandEffect(5, new FilterCreatureCard(), Zone.LIBRARY),
                TargetController.YOU, false));
    }

    public JunmraWildSovereign(final JunmraWildSovereign card){super(card);}

    @Override
    public JunmraWildSovereign copy(){return new JunmraWildSovereign(this);}
}
