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

        cards.add(new SetCardInfo("Containment Priest", 5, Rarity.RARE, mage.cards.c.ContainmentPriest.class));
        cards.add(new SetCardInfo("Smite the Monstrous", 29, Rarity.COMMON, mage.cards.s.SmiteTheMonstrous.class));
        cards.add(new SetCardInfo("Solemn Offering", 30, Rarity.UNCOMMON, mage.cards.s.SolemnOffering.class));
        cards.add(new SetCardInfo("Divination", 55, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Negate", 68, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Opt", 69, Rarity.COMMON, mage.cards.o.Opt.class));
        cards.add(new SetCardInfo("Blazing Volley", 129, Rarity.COMMON, mage.cards.b.BlazingVolley.class));
        cards.add(new SetCardInfo("Fervent Strike", 145, Rarity.COMMON, mage.cards.f.FerventStrike.class));
        cards.add(new SetCardInfo("Artisan's Sorrow", 170, Rarity.COMMON, mage.cards.a.ArtisansSorrow.class));
        cards.add(new SetCardInfo("Wild Instincts", 206, Rarity.COMMON, mage.cards.w.WildInstincts.class));
        cards.add(new SetCardInfo("Gilded Lotus", 231, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Prophetic Prism", 234, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class));
        cards.add(new SetCardInfo("Island", 251, Rarity.LAND, mage.cards.basiclands.Island.class));
        cards.add(new SetCardInfo("Swamp", 252, Rarity.LAND, mage.cards.basiclands.Swamp.class));
        cards.add(new SetCardInfo("Mountain", 253, Rarity.LAND, mage.cards.basiclands.Mountain.class));
        cards.add(new SetCardInfo("Forest", 254, Rarity.LAND, mage.cards.basiclands.Forest.class));
    }
}
