package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class CustomCore2018 extends ExpansionSet {

    private static final CustomCore2018 instance = new CustomCore2018();

    public static CustomCore2018 getInstance() {
        return instance;
    }

    private CustomCore2018() {
        super("Custom Core 2018", "CC18", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = false;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //TODO cards
    }
}
