package mage.cards.i;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.CivilizedCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInHandEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.common.FilterPermanentCard;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.filter.predicate.mageobject.SubtypePredicate;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

public final class ImperatorNamuzzar extends CardImpl {

    private static final FilterPermanentCard filter = new FilterPermanentCard("artifact or enchantment");
    private static final FilterCreaturePermanent filter2 = new FilterCreaturePermanent("Lammasu");

    static{
        filter.add(Predicates.or(new CardTypePredicate(CardType.ENCHANTMENT), new CardTypePredicate(CardType.ARTIFACT)));
        filter2.add(new SubtypePredicate(SubType.LAMMASU));
    }

    public ImperatorNamuzzar(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{4}{W}{U}");
        this.addSuperType(SuperType.LEGENDARY);

        this.subtype.add(SubType.LAMMASU);
        this.power = new MageInt(4);
        this.toughness = new MageInt(5);

        this.addAbility(FlyingAbility.getInstance());

        //When Imperator Namuzzar enters the battlefield, search your library for an artifact or enchantment card, reveal it, put it into your hand, then shuffle your library.
        this.addAbility(new EntersBattlefieldAbility(new SearchLibraryPutInHandEffect(new TargetCardInLibrary(filter))));

        //Civilized - Lammasu you control get +2/+2 as long as you control an artifact, a creature, and an enchantment.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new ConditionalContinuousEffect(
                new BoostControlledEffect(2, 2, Duration.WhileOnBattlefield, filter2), CivilizedCondition.instance,
                "<i>Civilized</i> &mdash; Lammasu you control get +2/+2 as long as you control an artifact, a creature, and an enchantment.")));
    }

    public ImperatorNamuzzar(final ImperatorNamuzzar card) {
        super(card);
    }

    @Override
    public ImperatorNamuzzar copy() {
        return new ImperatorNamuzzar(this);
    }
}
