package mage.cards.p;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.PowerPredicate;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class ParagonDragonslayer extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature with power 4 or more");

    static {
        filter.add(new PowerPredicate(ComparisonType.MORE_THAN, 3));
    }



    public ParagonDragonslayer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.KNIGHT);
        this.power = new MageInt(3);
        this.toughness = new MageInt(2);
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new DestroyTargetEffect(), new ManaCostsImpl("{W}"));
        ability.addCost(new SacrificeSourceCost());
        ability.addTarget(new TargetCreaturePermanent(filter));
        this.addAbility(ability);

    }

    public ParagonDragonslayer(final ParagonDragonslayer card) {

        super(card);
    }

    @Override
    public ParagonDragonslayer copy() {

        return new ParagonDragonslayer(this);
    }
}
