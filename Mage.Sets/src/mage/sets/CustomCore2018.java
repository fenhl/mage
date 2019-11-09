package mage.sets;


import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author Fenhl
 */
public final class CustomCore2018 extends ExpansionSet {

    private static final CustomCore2018 instance = new CustomCore2018();

    public static CustomCore2018 getInstance() {
        return instance;
    }

    private CustomCore2018() {
        super("Custom Core 2018", "CC18", ExpansionSet.buildDate(2018, 1, 12), SetType.CUSTOM_SET);
        this.hasBoosters = true;
        this.hasBasicLands = false;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Accorder Paladin", 1, Rarity.UNCOMMON, mage.cards.a.AccorderPaladin.class));
        cards.add(new SetCardInfo("Angel of Mercy", 2, Rarity.COMMON, mage.cards.a.AngelOfMercy.class));
        cards.add(new SetCardInfo("Angelic Wall", 4, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        cards.add(new SetCardInfo("Attended Knight", 6, Rarity.COMMON, mage.cards.a.AttendedKnight.class));
        cards.add(new SetCardInfo("Auramancer", 7, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Battle Mastery", 9, Rarity.UNCOMMON, mage.cards.b.BattleMastery.class));
        cards.add(new SetCardInfo("Blinding Mage", 10, Rarity.UNCOMMON, mage.cards.b.BlindingMage.class));
        cards.add(new SetCardInfo("Demystify", 14, Rarity.COMMON, mage.cards.d.Demystify.class));
        cards.add(new SetCardInfo("Divine Favor", 15, Rarity.COMMON, mage.cards.d.DivineFavor.class));
        cards.add(new SetCardInfo("Immolating Glare", 19, Rarity.UNCOMMON, mage.cards.i.ImmolatingGlare.class));
        cards.add(new SetCardInfo("Knight Errant", 20, Rarity.COMMON, mage.cards.k.KnightErrant.class));
        cards.add(new SetCardInfo("Knight Watch", 21, Rarity.COMMON, mage.cards.k.KnightWatch.class));
        cards.add(new SetCardInfo("Leonin Snarecaster", 23, Rarity.COMMON, mage.cards.l.LeoninSnarecaster.class));
        cards.add(new SetCardInfo("Marked by Honor", 24, Rarity.COMMON, mage.cards.m.MarkedByHonor.class));
        cards.add(new SetCardInfo("Pacifism", 26, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Raise the Alarm", 28, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Repel the Darkness", 29, Rarity.COMMON, mage.cards.r.RepelTheDarkness.class));
        cards.add(new SetCardInfo("Seeker of the Way", 33, Rarity.UNCOMMON, mage.cards.s.SeekerOfTheWay.class));
        cards.add(new SetCardInfo("Serra Angel", 35, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Sheltering Light", 36, Rarity.COMMON, mage.cards.s.ShelteringLight.class));
        cards.add(new SetCardInfo("Anticipate", 39, Rarity.COMMON, mage.cards.a.Anticipate.class));
        cards.add(new SetCardInfo("Cloaked Siren", 42, Rarity.COMMON, mage.cards.c.CloakedSiren.class));
        cards.add(new SetCardInfo("Clone", 43, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Convolute", 44, Rarity.COMMON, mage.cards.c.Convolute.class));
        cards.add(new SetCardInfo("Crippling Chill", 46, Rarity.COMMON, mage.cards.c.CripplingChill.class));
        cards.add(new SetCardInfo("Disperse", 49, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Dissipate", 50, Rarity.UNCOMMON, mage.cards.d.Dissipate.class));
        cards.add(new SetCardInfo("Divination", 51, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Kraken Hatchling", 56, Rarity.COMMON, mage.cards.k.KrakenHatchling.class));
        cards.add(new SetCardInfo("Mind Control", 59, Rarity.RARE, mage.cards.m.MindControl.class));
        cards.add(new SetCardInfo("Mnemonic Wall", 61, Rarity.COMMON, mage.cards.m.MnemonicWall.class));
        cards.add(new SetCardInfo("Negate", 62, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Sensory Deprivation", 65, Rarity.COMMON, mage.cards.s.SensoryDeprivation.class));
        cards.add(new SetCardInfo("Sleep Paralysis", 66, Rarity.COMMON, mage.cards.s.SleepParalysis.class));
        cards.add(new SetCardInfo("Spectral Flight", 67, Rarity.COMMON, mage.cards.s.SpectralFlight.class));
        cards.add(new SetCardInfo("Turn to Frog", 71, Rarity.UNCOMMON, mage.cards.t.TurnToFrog.class));
        cards.add(new SetCardInfo("Wall of Frost", 72, Rarity.UNCOMMON, mage.cards.w.WallOfFrost.class));
        cards.add(new SetCardInfo("Water Servant", 74, Rarity.UNCOMMON, mage.cards.w.WaterServant.class));
        cards.add(new SetCardInfo("Welkin Tern", 76, Rarity.COMMON, mage.cards.w.WelkinTern.class));
        cards.add(new SetCardInfo("Altar's Reap", 77, Rarity.COMMON, mage.cards.a.AltarsReap.class));
        cards.add(new SetCardInfo("Blood Bairn", 82, Rarity.COMMON, mage.cards.b.BloodBairn.class));
        cards.add(new SetCardInfo("Carrion Crow", 84, Rarity.COMMON, mage.cards.c.CarrionCrow.class));
        cards.add(new SetCardInfo("Child of Night", 85, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 90, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Duress", 91, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Falkenrath Noble", 92, Rarity.UNCOMMON, mage.cards.f.FalkenrathNoble.class));
        cards.add(new SetCardInfo("Gravedigger", 94, Rarity.UNCOMMON, mage.cards.g.Gravedigger.class));
        cards.add(new SetCardInfo("Memoricide", 100, Rarity.RARE, mage.cards.m.Memoricide.class));
        cards.add(new SetCardInfo("Mind Rot", 101, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Murder", 102, Rarity.UNCOMMON, mage.cards.m.Murder.class));
        cards.add(new SetCardInfo("Raise Dead", 104, Rarity.COMMON, mage.cards.r.RaiseDead.class));
        cards.add(new SetCardInfo("Sengir Vampire", 105, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Shadowcloak Vampire", 106, Rarity.COMMON, mage.cards.s.ShadowcloakVampire.class));
        cards.add(new SetCardInfo("Sorin's Thirst", 109, Rarity.COMMON, mage.cards.s.SorinsThirst.class));
        cards.add(new SetCardInfo("Zof Shade", 114, Rarity.COMMON, mage.cards.z.ZofShade.class));
        cards.add(new SetCardInfo("Act of Treason", 115, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        cards.add(new SetCardInfo("Borderland Marauder", 118, Rarity.COMMON, mage.cards.b.BorderlandMarauder.class));
        cards.add(new SetCardInfo("Brimstone Volley", 119, Rarity.COMMON, mage.cards.b.BrimstoneVolley.class));
        cards.add(new SetCardInfo("Goblin War Paint", 126, Rarity.COMMON, mage.cards.g.GoblinWarPaint.class));
        cards.add(new SetCardInfo("Lava Axe", 134, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Minotaur Skullcleaver", 137, Rarity.COMMON, mage.cards.m.MinotaurSkullcleaver.class));
        cards.add(new SetCardInfo("Pinnacle of Rage", 140, Rarity.UNCOMMON, mage.cards.p.PinnacleOfRage.class));
        cards.add(new SetCardInfo("Riot Devils", 142, Rarity.COMMON, mage.cards.r.RiotDevils.class));
        cards.add(new SetCardInfo("Sigiled Skink", 145, Rarity.COMMON, mage.cards.s.SigiledSkink.class));
        cards.add(new SetCardInfo("Smelt", 146, Rarity.COMMON, mage.cards.s.Smelt.class));
        cards.add(new SetCardInfo("Sure Strike", 147, Rarity.COMMON, mage.cards.s.SureStrike.class));
        cards.add(new SetCardInfo("Tormenting Voice", 148, Rarity.COMMON, mage.cards.t.TormentingVoice.class));
        cards.add(new SetCardInfo("Trumpet Blast", 149, Rarity.COMMON, mage.cards.t.TrumpetBlast.class));
        cards.add(new SetCardInfo("Volcanic Dragon", 150, Rarity.UNCOMMON, mage.cards.v.VolcanicDragon.class));
        cards.add(new SetCardInfo("Acidic Slime", 153, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Bond Beetle", 156, Rarity.COMMON, mage.cards.b.BondBeetle.class));
        cards.add(new SetCardInfo("Borderland Ranger", 157, Rarity.COMMON, mage.cards.b.BorderlandRanger.class));
        cards.add(new SetCardInfo("Briarpack Alpha", 158, Rarity.UNCOMMON, mage.cards.b.BriarpackAlpha.class));
        cards.add(new SetCardInfo("Centaur Courser", 159, Rarity.COMMON, mage.cards.c.CentaurCourser.class));
        cards.add(new SetCardInfo("Cultivate", 162, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Elvish Visionary", 163, Rarity.COMMON, mage.cards.e.ElvishVisionary.class));
        cards.add(new SetCardInfo("Garruk Wildspeaker", 165, Rarity.MYTHIC, mage.cards.g.GarrukWildspeaker.class));
        cards.add(new SetCardInfo("Giant Spider", 166, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Gravetiller Wurm", 167, Rarity.UNCOMMON, mage.cards.g.GravetillerWurm.class));
        cards.add(new SetCardInfo("Greater Basilisk", 168, Rarity.COMMON, mage.cards.g.GreaterBasilisk.class));
        cards.add(new SetCardInfo("Kalonian Tusker", 171, Rarity.UNCOMMON, mage.cards.k.KalonianTusker.class));
        cards.add(new SetCardInfo("Naturalize", 173, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Obstinate Baloth", 175, Rarity.RARE, mage.cards.o.ObstinateBaloth.class));
        cards.add(new SetCardInfo("Plummet", 176, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Prey Upon", 177, Rarity.COMMON, mage.cards.p.PreyUpon.class));
        cards.add(new SetCardInfo("Ranger's Guile", 179, Rarity.COMMON, mage.cards.r.RangersGuile.class));
        cards.add(new SetCardInfo("Rumbling Baloth", 181, Rarity.COMMON, mage.cards.r.RumblingBaloth.class));
        cards.add(new SetCardInfo("Skysnare Spider", 182, Rarity.UNCOMMON, mage.cards.s.SkysnareSpider.class));
        cards.add(new SetCardInfo("Titanic Growth", 187, Rarity.COMMON, mage.cards.t.TitanicGrowth.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 196, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Notion Thief", 202, Rarity.RARE, mage.cards.n.NotionThief.class));
        cards.add(new SetCardInfo("Warleader's Helix", 215, Rarity.UNCOMMON, mage.cards.w.WarleadersHelix.class));
        cards.add(new SetCardInfo("Burnished Heart", 216, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Cobbled Wings", 217, Rarity.COMMON, mage.cards.c.CobbledWings.class));
        cards.add(new SetCardInfo("Demonmail Hauberk", 218, Rarity.UNCOMMON, mage.cards.d.DemonmailHauberk.class));
        cards.add(new SetCardInfo("Guardian Automaton", 220, Rarity.COMMON, mage.cards.g.GuardianAutomaton.class));
        cards.add(new SetCardInfo("Pithing Needle", 225, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Prophetic Prism", 226, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 230, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Tormod's Crypt", 231, Rarity.UNCOMMON, mage.cards.t.TormodsCrypt.class));
        cards.add(new SetCardInfo("Cinder Barrens", 233, Rarity.UNCOMMON, mage.cards.c.CinderBarrens.class));
        cards.add(new SetCardInfo("Dragonskullsummit", 234, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Drowned Catacombs", 235, Rarity.RARE, mage.cards.d.DrownedCatacomb.class));
        cards.add(new SetCardInfo("Forsaken Sanctuary", 236, Rarity.UNCOMMON, mage.cards.f.ForsakenSanctuary.class));
        cards.add(new SetCardInfo("Foul Orchard", 237, Rarity.UNCOMMON, mage.cards.f.FoulOrchard.class));
        cards.add(new SetCardInfo("Glacial Fortress", 238, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Highland Lake", 239, Rarity.UNCOMMON, mage.cards.h.HighlandLake.class));
        cards.add(new SetCardInfo("Meandering River", 240, Rarity.UNCOMMON, mage.cards.m.MeanderingRiver.class));
        cards.add(new SetCardInfo("Rootbound Crag", 241, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Stone Quarry", 242, Rarity.UNCOMMON, mage.cards.s.StoneQuarry.class));
        cards.add(new SetCardInfo("Submerged Boneyard", 243, Rarity.UNCOMMON, mage.cards.s.SubmergedBoneyard.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 244, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 245, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Timber Gorge", 246, Rarity.UNCOMMON, mage.cards.t.TimberGorge.class));
        cards.add(new SetCardInfo("Tranquil Expanse", 247, Rarity.UNCOMMON, mage.cards.t.TranquilExpanse.class));
        cards.add(new SetCardInfo("Unknown Shores", 248, Rarity.COMMON, mage.cards.u.UnknownShores.class));
        cards.add(new SetCardInfo("Woodland Stream", 249, Rarity.UNCOMMON, mage.cards.w.WoodlandStream.class));
    }
}
