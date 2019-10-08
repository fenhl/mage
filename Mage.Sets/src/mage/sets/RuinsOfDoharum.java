package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class RuinsOfDoharum extends ExpansionSet {

    private static final RuinsOfDoharum instance = new RuinsOfDoharum();

    public static RuinsOfDoharum getInstance() {
        return instance;
    }

    private RuinsOfDoharum() {
        super("Ruins of Doharum", "DHM", ExpansionSet.buildDate(2018, 8, 30), SetType.CUSTOM_SET);
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
