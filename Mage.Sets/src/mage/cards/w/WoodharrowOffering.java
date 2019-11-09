package mage.cards.w;

import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.abilities.keyword.TortureAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class WoodharrowOffering extends CardImpl {
    public WoodharrowOffering(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}");

        this.addAbility(new TortureAbility());

        // Search your library for a basic land card, put it onto the battlefield tapped, then shuffle your library.
        this.getSpellAbility().addEffect(new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(StaticFilters.FILTER_CARD_BASIC_LAND), true, true));
    }

    public WoodharrowOffering(final WoodharrowOffering card) { super(card); }

    @Override
    public WoodharrowOffering copy() { return new WoodharrowOffering(this); }
}
