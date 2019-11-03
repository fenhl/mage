package mage.deck;

import mage.cards.decks.Constructed;
import mage.constants.Rarity;

/**
 * @author Fenhl
 */
public class CustomPauper extends Constructed {
    public CustomPauper() {
        super("Custom Pauper");
        setCodes.addAll(CustomEternal.makeLegalSets());
        rarities.add(Rarity.COMMON);
        rarities.add(Rarity.LAND);
        // no banlist currently
    }
}
