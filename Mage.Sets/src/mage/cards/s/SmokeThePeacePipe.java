package mage.cards.s;

import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.TapTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class SmokeThePeacePipe extends CardImpl {

    public SmokeThePeacePipe(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.ENCHANTMENT}, "{W}");
        this.subtype.add(SubType.AURA);

        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.AddAbility));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);

        Ability grantedAbility =  new SimpleActivatedAbility(new TapTargetEffect(), new TapSourceCost());
        grantedAbility.addTarget(new TargetCreaturePermanent());

        //Enchanted creature has ability
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new GainAbilityAttachedEffect(grantedAbility,
                        AttachmentType.AURA, Duration.WhileOnBattlefield)));


    }


    public SmokeThePeacePipe(final SmokeThePeacePipe card) {
        super(card);
    }

    @Override
    public SmokeThePeacePipe copy() {
        return new SmokeThePeacePipe(this);
    }
}
