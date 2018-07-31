package mage.cards.n;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfCombatTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.effects.common.MayTapOrUntapTargetEffect;
import mage.abilities.effects.common.discard.DiscardTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.target.common.TargetCreaturePermanent;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author fireshoes
 */
public final class NimbusHog extends CardImpl {

    public NimbusHog(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{3}{W}");
        this.subtype.add(SubType.BOAR);
        this.power = new MageInt(2);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // When Bounding Krasis enters the battlefield, you may tap or untap target creature.
        Ability ability = new BeginningOfCombatTriggeredAbility(new MayTapOrUntapTargetEffect(), TargetController.ANY, false);
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    public NimbusHog(final NimbusHog card) {
        super(card);
    }

    @Override
    public NimbusHog copy() {
        return new NimbusHog(this);
    }
}
