package mage.cards.r;


import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.combat.CanBlockAdditionalCreatureAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.mageobject.SubtypePredicate;

import java.util.UUID;

/**
 *
 * @author EikePeace
 */
public final class RiotTrooper extends CardImpl {

    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("Trooper creatures you control");

    static{
        filter.add(new SubtypePredicate(SubType.TROOPER ));;
    }

    public RiotTrooper(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.TROOPER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Trooper creatures you control have menace.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new CanBlockAdditionalCreatureAllEffect(1, filter, Duration.WhileOnBattlefield)));



    }

    public RiotTrooper(final RiotTrooper card) {
        super(card);
    }

    @Override
    public RiotTrooper copy() {
        return new RiotTrooper(this);
    }
}
