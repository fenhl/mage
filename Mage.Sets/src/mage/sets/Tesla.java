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
        cards.add(new SetCardInfo("Cinder Barrens", 238, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("Explosive Apparatus", 216, Rarity.COMMON, mage.cards.e.ExplosiveApparatus.class));
        cards.add(new SetCardInfo("Favorable Winds", 44, Rarity.UNCOMMON, mage.cards.f.FavorableWinds.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Ghirapur Gearcrafter", 123, Rarity.COMMON, mage.cards.g.GhirapurGearcrafter.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Make Obsolete", 88, Rarity.UNCOMMON, mage.cards.m.MakeObsolete.class));
        cards.add(new SetCardInfo("Meandering River", 243, Rarity.UNCOMMON, mage.cards.m.MeanderingRiver.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Negate", 59, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Scouring Sands", 136, Rarity.COMMON, mage.cards.s.ScouringSands.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 245, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Timber Gorge", 246, Rarity.UNCOMMON, mage.cards.t.TimberGorge.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 247, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Unwilling Recruit", 141, Rarity.UNCOMMON, mage.cards.u.UnwillingRecruit.class));
    }
}
