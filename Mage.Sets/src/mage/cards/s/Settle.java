package mage.cards.s;

import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class Settle extends CardImpl {
    public Settle(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}");

        // Search your library for a land card, put it onto the battlefield tapped, then shuffle your library.
        this.getSpellAbility().addEffect(new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(StaticFilters.FILTER_CARD_LAND), true, true));
    }

    public Settle(final Settle card) { super(card); }

    @Override
    public Settle copy() { return new Settle(this); }
}
