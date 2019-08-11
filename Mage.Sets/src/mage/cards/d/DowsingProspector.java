package mage.cards.d;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.keyword.ScryEffect;
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
public final class DowsingProspector extends CardImpl {
    public DowsingProspector(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SCOUT);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        //ETB: Scry 1
        this.addAbility(new EntersBattlefieldTriggeredAbility(new ScryEffect(1)));
    }

    public DowsingProspector (final DowsingProspector card){
        super(card);
    }

    @Override
    public DowsingProspector copy(){
        return new DowsingProspector(this);
    }
}
