package mage.cards.b;

import mage.abilities.Ability;
import mage.abilities.common.DiesAttachedTriggeredAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.LoseLifeOpponentsEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.TargetPermanent;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */
public final class BadBlood extends CardImpl {
    public BadBlood(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{B}");
        this.subtype.add(SubType.AURA);

        //Enchant target creature you control.
        TargetPermanent auraTarget = new TargetControlledCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        //Enchanted Creature gets +3/+0.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new BoostEnchantedEffect(3,0)));

        //When enchanted creature dies, each opponent loses 3 life.
        this.addAbility(new DiesAttachedTriggeredAbility(new LoseLifeOpponentsEffect(3),"enchanted Creature",false));
    }

    public BadBlood(final BadBlood card) {
        super(card);
    }

    @Override
    public BadBlood copy() {
        return new BadBlood(this);
    }
}
