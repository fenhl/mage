
package mage.filter.predicate.permanent;

import mage.filter.predicate.ObjectSourcePlayer;
import mage.filter.predicate.ObjectSourcePlayerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;

/**
 * @author North
 */
public enum AnotherPredicate implements ObjectSourcePlayerPredicate<ObjectSourcePlayer<Permanent>> {
    instance;

    @Override
    public boolean apply(ObjectSourcePlayer<Permanent> input, Game game) {
        return !input.getObject().getId().equals(input.getSourceId());
    }

    @Override
    public String toString() {
        return "Another";
    }
}
