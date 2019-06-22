package mage.cards.e;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.Condition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.game.Game;
import mage.watchers.common.CardsDrawnThisTurnWatcher;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class Eyekite extends CardImpl {

    public Eyekite(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{U}");

        this.subtype.add(SubType.DRAKE);
        this.power = new MageInt(1);
        this.toughness = new MageInt(2);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Eyekite gets +2/+0 as long as you've drawn two or more cards this turn.
        this.addAbility(new SimpleStaticAbility(new ConditionalContinuousEffect(
                new BoostSourceEffect(2, 0, Duration.WhileOnBattlefield),
                EyekiteCondition.instance, "{this} gets +2/+0 as long as you've drawn two or more cards this turn."
        )), new CardsDrawnThisTurnWatcher());
    }

    private Eyekite(final Eyekite card) {
        super(card);
    }

    @Override
    public Eyekite copy() {
        return new Eyekite(this);
    }
}

enum EyekiteCondition implements Condition {
    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        CardsDrawnThisTurnWatcher watcher = game.getState().getWatcher(CardsDrawnThisTurnWatcher.class);
        return watcher != null && watcher.getCardsDrawnThisTurn(source.getControllerId()) > 1;
    }
}