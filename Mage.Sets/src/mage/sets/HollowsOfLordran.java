package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class HollowsOfLordran extends ExpansionSet {

    private static final HollowsOfLordran instance = new HollowsOfLordran();

    public static HollowsOfLordran getInstance() {
        return instance;
    }

    private HollowsOfLordran() {
        super("Hollows of Lordran", "HLW", ExpansionSet.buildDate(2018, 1, 21), SetType.CUSTOM_SET);
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
