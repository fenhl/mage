package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class Aenyr extends ExpansionSet {

    private static final Aenyr instance = new Aenyr();

    public static Aenyr getInstance() {
        return instance;
    }

    private Aenyr() {
        super("Aenyr", "AYR", ExpansionSet.buildDate(2016, 12, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Blood Artist", 49, Rarity.UNCOMMON, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Painter's Servant", 230, Rarity.RARE, mage.cards.p.PaintersServant.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Satyr Wayfinder", 106, Rarity.COMMON, mage.cards.s.SatyrWayfinder.class));
        cards.add(new SetCardInfo("Springleaf Drum", 233, Rarity.COMMON, mage.cards.s.SpringleafDrum.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Thundersong Trumpeter", 185, Rarity.COMMON, mage.cards.t.ThundersongTrumpeter.class));
        cards.add(new SetCardInfo("Ultimate Price", 66, Rarity.UNCOMMON, mage.cards.u.UltimatePrice.class));
    }
}
