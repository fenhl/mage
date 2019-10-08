package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Netropolis extends ExpansionSet {

    private static final Netropolis instance = new Netropolis();

    public static Netropolis getInstance() {
        return instance;
    }

    private Netropolis() {
        super("Netropolis", "NET", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //TODO cards
    }
}
