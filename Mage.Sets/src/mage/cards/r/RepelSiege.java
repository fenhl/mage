package mage.cards.r;

import mage.abilities.effects.common.DestroyAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.BlockedPredicate;

import java.util.UUID;

public final class RepelSiege extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("blocked creature");

    static {
        filter.add(new BlockedPredicate());
    }

    public RepelSiege(UUID ownerId, CardSetInfo cardSetInfo) {
        super(ownerId, cardSetInfo, new CardType[] {CardType.INSTANT}, "{1}{W}{W}");
        this.getSpellAbility().addEffect(new DestroyAllEffect(filter));

    }

    public RepelSiege(final RepelSiege card) {
        super(card);
    }

    @Override
    public RepelSiege copy() {
        return new RepelSiege(this);
    }
}
