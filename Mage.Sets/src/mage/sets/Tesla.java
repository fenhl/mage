package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Tesla extends ExpansionSet {

    private static final Tesla instance = new Tesla();

    public static Tesla getInstance() {
        return instance;
    }

    private Tesla() {
        super("Tesla", "TSL", ExpansionSet.buildDate(2017, 4, 21), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //TODO cards
        cards.add(new SetCardInfo("Suljet, the Cog Mind", 199, Rarity.MYTHIC, mage.cards.s.SuljetTheCogMind.class));
    }
}
