package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Vastuum extends ExpansionSet {

    private static final Vastuum instance = new Vastuum();

    public static Vastuum getInstance() {
        return instance;
    }

    private Vastuum() {
        super("Vastuum", "VST", ExpansionSet.buildDate(2018, 6, 18), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //TODO cards
    }
}
