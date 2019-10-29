
package mage.cards.m;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.SourceHasCounterCondition;
import mage.abilities.effects.common.combat.CantAttackBlockUnlessConditionSourceEffect;
import mage.abilities.effects.common.continuous.UntapAllDuringEachOtherPlayersUntapStepEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.permanent.AnotherPredicate;

import java.util.UUID;

/**
 *
 * @author emerald000
 */
public final class MaatGodOfHarmony extends CardImpl {

    private static final FilterControlledPermanent filter = new FilterControlledPermanent("other permanents you control");

    static {
        filter.add(AnotherPredicate.instance);
    }

    public MaatGodOfHarmony(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE, CardType.ENCHANTMENT},"{3}{G}{G}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);

        this.power = new MageInt(5);
        this.toughness = new MageInt(7);

        this.addAbility(IndestructibleAbility.getInstance());
        this.addAbility(VigilanceAbility.getInstance());
        //can't attack or block unless she has a +1/+1 Counter
        this.addAbility(new SimpleStaticAbility(new CantAttackBlockUnlessConditionSourceEffect(new SourceHasCounterCondition(CounterType.P1P1))));
        // Untap all permanents you control during each other player's untap step.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new UntapAllDuringEachOtherPlayersUntapStepEffect(filter)));
    }

    public MaatGodOfHarmony(final MaatGodOfHarmony card) {
        super(card);
    }

    @Override
    public MaatGodOfHarmony copy() {
        return new MaatGodOfHarmony(this);
    }
}
