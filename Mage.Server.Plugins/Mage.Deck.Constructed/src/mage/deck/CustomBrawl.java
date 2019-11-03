package mage.deck;

/**
 * @author Fenhl
 */
public class CustomBrawl extends Brawl {
    public CustomBrawl() {
        super("Custom Brawl");
        setCodes.addAll(CustomStandard.makeLegalSets());
        // no banlist currently
    }
}
