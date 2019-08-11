package mage.cards.f;

import mage.abilities.condition.common.MyTurnCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class Foretell extends CardImpl {
    public Foretell(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{3}{U}");
        this.getSpellAbility().addEffect(new ConditionalOneShotEffect(new ScryEffect(2), MyTurnCondition.instance, "If it's your turn, scry 2"));
        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(2));
    }
        

    public Foretell( final Foretell card){
            super(card);
        }

        @Override
        public Foretell copy () {
            return new Foretell(this);
        }

}


