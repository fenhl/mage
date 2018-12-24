
package mage.cards.b;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.abilities.keyword.HexproofAbility;
import mage.abilities.keyword.ReflexAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.TargetPermanent;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 *
 * @author EikePeace
 */
public final class BulletproofBarrier extends CardImpl {

    public BulletproofBarrier(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{U}");

        this.subtype.add(SubType.AURA, SubType.CARTOUCHE);


        // Enchant creature you control
        TargetPermanent auraTarget = new TargetControlledCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);


        //Reflex
        this.addAbility(new ReflexAbility(this, "{3}{U}"));
        // Enchanted creature gets +1/+2.


        //Sacrifice ~, enchanted Creature gains Hexproof until end of turn
        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD, new GainAbilityAttachedEffect(HexproofAbility.getInstance(), AttachmentType.AURA, Duration.EndOfTurn), new SacrificeSourceCost()));

    }

    public BulletproofBarrier(final BulletproofBarrier card) {
        super(card);
    }

    @Override
    public BulletproofBarrier copy() {
        return new BulletproofBarrier(this);
    }

   private static class BulletproofBarrierHexproofEffect extends OneShotEffect {

        public BulletproofBarrierHexproofEffect() {
            super(Outcome.ReturnToHand);
            staticText = "Return enchanted creature to its owner's hand";
        }

      public BulletproofBarrierHexproofEffect(final BulletproofBarrierHexproofEffect effect) {
            super(effect);
        }

      @Override
        public BulletproofBarrierHexproofEffect copy() {
            return new BulletproofBarrierHexproofEffect(this);
        }

        @Override
        public boolean apply(Game game, Ability source) {
            Permanent permanent = (Permanent) game.getLastKnownInformation(source.getSourceId(), Zone.BATTLEFIELD);
            if (permanent != null && permanent.getAttachedTo() != null)
            {
                Permanent enchantedCreature = game.getPermanent(permanent.getAttachedTo());
                if (enchantedCreature != null) {
                    enchantedCreature.addAbility(HexproofAbility.getInstance());
                    return true;
                }
            }
            return false;
        }
    }
}
