package mage.cards.n;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetEnchantmentPermanent;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class NaakiHealer extends CardImpl {

    public NaakiHealer(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE},"{3}{W}");
        this.subtype.add(SubType.BIRD);
        this.subtype.add(SubType.SHAMAN);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        //Flying.
        this.addAbility(FlyingAbility.getInstance());

        //When Naaki Healer enters the battlefield, you may destroy target enchantment.
        Ability ability = new EntersBattlefieldTriggeredAbility(new DestroyTargetEffect(), true);
        ability.addTarget(new TargetEnchantmentPermanent());
        this.addAbility(ability);
    }

    public NaakiHealer(final NaakiHealer card) {
        super(card);
    }

    @Override
    public NaakiHealer copy() {
        return new NaakiHealer(this);
    }
}
