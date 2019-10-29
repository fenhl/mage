package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Jannada extends ExpansionSet {

    private static final Jannada instance = new Jannada();

    public static Jannada getInstance() {
        return instance;
    }

    private Jannada() {
        super("Jannada", "JAN", ExpansionSet.buildDate(2017, 11, 5), SetType.CUSTOM_SET);
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
