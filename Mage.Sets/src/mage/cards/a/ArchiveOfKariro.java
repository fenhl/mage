package mage.cards.a;

import mage.abilities.condition.common.CardsInHandCondition;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.decorator.ConditionalActivatedAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.mana.ColorlessManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.SuperType;
import mage.constants.Zone;

import java.util.UUID;

/**
 * @author Fenhl
 */
public final class ArchiveOfKariro extends CardImpl {
    public ArchiveOfKariro(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");
        this.addSuperType(SuperType.LEGENDARY);

        // {tap}: Add {C}.
        this.addAbility(new ColorlessManaAbility());
        // {tap}: Draw a card. Activate this ability only if you have exactly eight cards in hand.
        this.addAbility(new ConditionalActivatedAbility(
            Zone.BATTLEFIELD,
            new DrawCardSourceControllerEffect(1),
            new TapSourceCost(),
            new CardsInHandCondition(ComparisonType.EQUAL_TO, 8),
            ""
        ));
    }

    public ArchiveOfKariro(final ArchiveOfKariro card) {
        super(card);
    }

    @Override
    public ArchiveOfKariro copy() {
        return new ArchiveOfKariro(this);
    }
}
