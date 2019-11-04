
package mage.abilities.effects.common;

import mage.abilities.Ability;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.token.CanisterToken;
import mage.players.Player;

/**
 * @author Eike Peace
 */

public class RechargeEffect extends OneShotEffect {


    public RechargeEffect() {
        super(Outcome.Benefit);
        this.staticText = "recharge. (Create a colorless Canister artifact token with \"{T}, Sacrifice this artifact:" +
                " Untap target permanent. Activate this ability only during your turn.\")</i>";
    }

    public RechargeEffect(final RechargeEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player == null) {
            return false;
        }
        Effect effect = new CreateTokenEffect(new CanisterToken(), 1);
        return effect.apply(game, source);
    }

    @Override
    public RechargeEffect copy() {
        return new RechargeEffect(this);
    }
}
