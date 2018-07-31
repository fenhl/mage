package mage.cards.s;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.TapTargetEffect;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public final class StunshotCentaur extends CardImpl {

    public StunshotCentaur(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.CREATURE}, "{4}{W}");
        this.subtype.add(SubType.CENTAUR);
        this.subtype.add(SubType.ARCHER);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
        this.addAbility(VigilanceAbility.getInstance());
        Ability ability = new SimpleActivatedAbility(new TapTargetEffect(), new ManaCostsImpl("{W}"));
        ability.addCost(new TapSourceCost());
        ability.addTarget(new TargetCreaturePermanent());

        this.addAbility(ability);
    }

    public StunshotCentaur(final StunshotCentaur card) {
        super(card);
    }

    @Override
    public StunshotCentaur copy() {
        return new StunshotCentaur(this);
    }
}
