package mage.cards.e;

import mage.abilities.effects.common.CounterTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.filter.FilterSpell;
import mage.filter.predicate.mageobject.ConvertedManaCostPredicate;
import mage.target.TargetSpell;

import java.util.UUID;

/**
 *
 *
 *
 * @author EikePeace
 */
public final class Expel extends CardImpl {

    private static final FilterSpell filter = new FilterSpell("spell with converted mana cost 3 or less");
    static {
        filter.add(new ConvertedManaCostPredicate(ComparisonType.FEWER_THAN, 4));
    }

    public Expel(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{U}{U}");
        this.getSpellAbility().addEffect(new CounterTargetEffect());
        this.getSpellAbility().addTarget(new TargetSpell(filter));
    }


    public Expel(final Expel card){
        super(card);
    }
    @Override
    public Expel copy(){
        return new Expel(this);
    }
}
