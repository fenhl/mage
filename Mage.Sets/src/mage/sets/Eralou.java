package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Eralou extends ExpansionSet {

    private static final Eralou instance = new Eralou();

    public static Eralou getInstance() {
        return instance;
    }

    private Eralou() {
        super("Eralou", "EAU", ExpansionSet.buildDate(2019, 2, 8), SetType.CUSTOM_SET);
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
