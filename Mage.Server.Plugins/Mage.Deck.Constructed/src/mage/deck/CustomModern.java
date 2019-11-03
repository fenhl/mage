package mage.deck;

import mage.cards.decks.Constructed;

/**
 * @author Fenhl
 */
public class CustomModern extends Constructed {
    public CustomModern() {
        super("Custom Modern");
        for (String code : CustomEternal.makeLegalSets()) {
            if (!code.equals("AYR") && !code.equals("DMS") && !code.equals("ANK")) {
                setCodes.add(code);
            }
        }
        // no banlist currently
    }
}
