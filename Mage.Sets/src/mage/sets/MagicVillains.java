package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class MagicVillains extends ExpansionSet {

    private static final MagicVillains instance = new MagicVillains();

    public static MagicVillains getInstance() {
        return instance;
    }

    private MagicVillains() {
        super("Magic Villains", "VLN", ExpansionSet.buildDate(2017, 8, 6), SetType.CUSTOM_SET);
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
