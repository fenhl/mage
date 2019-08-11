package mage.cards.g;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.decorator.ConditionalTriggeredAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.DontUntapInControllersUntapStepEnchantedEffect;
import mage.abilities.effects.common.UntapSourceEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.TargetPermanent;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import javax.swing.text.ZoneView;
import java.util.UUID;

/**
 * @author EikePeace
 */

public final class GoneFishin extends CardImpl {
    public GoneFishin(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{U}");
        this.subtype.add(SubType.AURA);


        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.Benefit));
        Ability ability = new EnchantAbility(auraTarget.getTargetName());
        this.addAbility(ability);


    }


    public GoneFishin(final GoneFishin card) {
        super(card);
    }

    @Override
    public GoneFishin copy() {
        return new GoneFishin(this);
    }
}

