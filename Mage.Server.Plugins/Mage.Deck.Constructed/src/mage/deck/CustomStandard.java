package mage.deck;

import mage.cards.decks.Constructed;

import java.util.*;

/**
 * @author Fenhl
 */
public class CustomStandard extends Constructed {
    public CustomStandard() {
        super("Custom Standard");
        setCodes.addAll(makeLegalSets());
        banned.add("Garruk Wildspeaker");
    }

    static List<String> makeLegalSets() { // separate method so it can be used by CustomBrawl
        List<String> codes = new ArrayList<>();
        codes.add("JAN");
        codes.add("HLW");
        codes.add("CC18");
        codes.add("RAK");
        codes.add("EAU");
        codes.add("SOU");
        codes.add("NET");
        return codes;
    }
}
