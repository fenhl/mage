package mage.cards.f;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.DrawDiscardControllerEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class FirstfeatherStormwing extends CardImpl {
    public FirstfeatherStormwing(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.SHAMAN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        //Flying
        this.addAbility(FlyingAbility.getInstance());

        //When Firstfeather Stormwing enters the battlefield, you may draw a card. If you do, discard a card.
        this.addAbility( new EntersBattlefieldTriggeredAbility(new DrawDiscardControllerEffect(1,1,true)));
    }

    public FirstfeatherStormwing(final FirstfeatherStormwing card){
        super(card);
    }

    @Override
    public FirstfeatherStormwing copy(){
        return new FirstfeatherStormwing(this);
    }
}
