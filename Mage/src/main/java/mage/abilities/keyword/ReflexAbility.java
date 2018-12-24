
package mage.abilities.keyword;

import mage.abilities.SpellAbility;
import mage.abilities.costs.mana.ManaCosts;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.cards.Card;
import mage.constants.SpellAbilityType;
import mage.constants.TimingRule;
import mage.constants.Zone;
import mage.util.CardUtil;

/**
 *
 *
 * @author Eike Peace
 *
 */
public class ReflexAbility extends SpellAbility {

    public ReflexAbility(Card card, String reflexCosts) {
        super(new ManaCostsImpl<>(reflexCosts), card.getName() + " with reflex", Zone.HAND, SpellAbilityType.BASE_ALTERNATE);
        this.getCosts().addAll(card.getSpellAbility().getCosts().copy());
        this.getEffects().addAll(card.getSpellAbility().getEffects().copy());
        this.getTargets().addAll(card.getSpellAbility().getTargets().copy());
        this.spellAbilityType = SpellAbilityType.BASE_ALTERNATE;
        this.timing = TimingRule.INSTANT;
    }

    public ReflexAbility(final ReflexAbility ability) {
        super(ability);
    }

    @Override
    public ReflexAbility copy() {
        return new ReflexAbility(this);
    }

    @Override
    public String getRule(boolean all) {
        return getRule();
    }

    @Override
    public String getRule() {
        return "Reflex " + costs + " <i>(You may cast this spell as an instant for its reflex cost.)</i>";
    }

}
