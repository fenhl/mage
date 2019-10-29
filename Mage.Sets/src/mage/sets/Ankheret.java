package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;


public final class Ankheret extends ExpansionSet {

    private static final Ankheret instance = new Ankheret();

    public static Ankheret getInstance() {
        return instance;
    }

    private Ankheret() {
        super("Core Set 2020", "ANK", ExpansionSet.buildDate(2017, 6, 23), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterSpecial = 0;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Ma'at, God of Harmony", 165, Rarity.MYTHIC, mage.cards.m.MaatGodOfHarmony.class));
        cards.add(new SetCardInfo("The Scorpion King", 202, Rarity.RARE, mage.cards.t.TheScorpionKing.class));
    }
}