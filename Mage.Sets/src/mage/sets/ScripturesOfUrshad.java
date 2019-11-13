package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class ScripturesOfUrshad extends ExpansionSet {

    private static final ScripturesOfUrshad instance = new ScripturesOfUrshad();

    public static ScripturesOfUrshad getInstance() {
        return instance;
    }

    private ScripturesOfUrshad() {
        super("Scriptures of Urshad", "SOU", ExpansionSet.buildDate(2019, 5, 29), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        //TODO cards
        cards.add(new SetCardInfo("Golden Age", 59, Rarity.RARE, mage.cards.g.GoldenAge.class));
        cards.add(new SetCardInfo("Imperator Namuzzar", 204, Rarity.RARE, mage.cards.i.ImperatorNamuzzar.class));
        cards.add(new SetCardInfo("Sunblessed Orator", 220, Rarity.UNCOMMON, mage.cards.s.SunblessedOrator.class));
    }
}
