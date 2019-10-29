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
        super("Ankheret", "ANK", ExpansionSet.buildDate(2016, 12, 8), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterSpecial = 0;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Annex", 39, Rarity.UNCOMMON, mage.cards.a.Annex.class));
        cards.add(new SetCardInfo("Bonds of Faith", 4, Rarity.COMMON, mage.cards.b.BondsOfFaith.class));
        cards.add(new SetCardInfo("Cobra Trap", 150, Rarity.UNCOMMON, mage.cards.c.CobraTrap.class));
        cards.add(new SetCardInfo("Cone of Flame", 120, Rarity.UNCOMMON, mage.cards.c.ConeOfFlame.class));
        cards.add(new SetCardInfo("Crumbling Vestige", 233, Rarity.COMMON, mage.cards.c.CrumblingVestige.class));
        cards.add(new SetCardInfo("Demolish", 122, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Desolate Lighthouse", 235, Rarity.RARE, mage.cards.d.DesolateLighthouse.class));
        cards.add(new SetCardInfo("Disentomb", 82, Rarity.COMMON, mage.cards.d.Disentomb.class));
        cards.add(new SetCardInfo("Divination", 45, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Expedition Map", 215, Rarity.COMMON, mage.cards.e.ExpeditionMap.class));
        cards.add(new SetCardInfo("Fade into Antiquity", 158, Rarity.COMMON, mage.cards.f.FadeIntoAntiquity.class));
        cards.add(new SetCardInfo("Forest", 262, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Forest", 263, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Forest", 264, Rarity.LAND, mage.cards.basiclands.Forest.class));
        cards.add(new SetCardInfo("Giant Growth", 159, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Harness the Storm", 130, Rarity.RARE, mage.cards.h.HarnessTheStorm.class));
        cards.add(new SetCardInfo("Island", 253, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Ma'at, God of Harmony", 165, Rarity.MYTHIC, mage.cards.m.MaatGodOfHarmony.class));
        cards.add(new SetCardInfo("Mana Confluence", 239, Rarity.RARE, mage.cards.m.ManaConfluence.class));
        cards.add(new SetCardInfo("Mountain", 259, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Mountain", 260, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Mountain", 261, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 220, Rarity.UNCOMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Sanctuary Cat", 28, Rarity.COMMON, mage.cards.s.SanctuaryCat.class));
        cards.add(new SetCardInfo("Scapeshift", 175, Rarity.RARE, mage.cards.s.Scapeshift.class));
        cards.add(new SetCardInfo("Sphinx's Revelation", 204, Rarity.MYTHIC, mage.cards.s.SphinxsRevelation.class));
        cards.add(new SetCardInfo("Swamp", 256, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Swamp", 257, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("The Scorpion King", 202, Rarity.RARE, mage.cards.t.TheScorpionKing.class));
        cards.add(new SetCardInfo("Unknown Shores", 248, Rarity.COMMON, mage.cards.u.UnknownShores.class));
        cards.add(new SetCardInfo("Vengeful Pharaoh", 110, Rarity.RARE, mage.cards.v.VengefulPharaoh.class));
    }
}
