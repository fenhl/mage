package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.util.SubTypeList;

import java.util.UUID;

public final class Chupacabra extends CardImpl {

    public Chupacabra(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{B}");
        this.subtype.add(SubType.VAMPIRE);
        this.subtype.add(SubType.HOUND);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        this.addAbility(new SimpleActivatedAbility(new ChupacabraEffect(), new SacrificeTargetCost(new TargetControlledCreaturePermanent())));
    }

    public Chupacabra(final Chupacabra card) {
        super(card);
    }

    @Override
    public Chupacabra copy() {
        return new Chupacabra(this);
    }
}

class ChupacabraEffect extends OneShotEffect {

    ChupacabraEffect() {
        super(Outcome.Benefit);
        staticText = "{this} gets +2/+2 until end of turn. If that creature was a Boar, Goat, Horse, Ox, or Sheep, put two +1/+1 counters on {this} instead.";
    }

    ChupacabraEffect(final mage.cards.c.ChupacabraEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Permanent sacrificedPermanent = null;
        for (Cost cost : source.getCosts()) {
            if (cost instanceof SacrificeTargetCost) {
                SacrificeTargetCost sacrificeCost = (SacrificeTargetCost) cost;
                if (!sacrificeCost.getPermanents().isEmpty()) {
                    sacrificedPermanent = sacrificeCost.getPermanents().get(0);
                }
                break;
            }
        }
        Player controller = game.getPlayer(source.getControllerId());
        if (sacrificedPermanent != null && controller != null) {
            SubTypeList subType = sacrificedPermanent.getSubtype(game);
            if (subType.contains(SubType.BOAR)
                    ||subType.contains(SubType.GOAT)
                    ||subType.contains(SubType.HORSE)
                    ||subType.contains(SubType.OX)
                    ||subType.contains(SubType.SHEEP)) {
                Card card = game.getCard(source.getSourceObject(game).getId());
                card.addCounters(CounterType.P1P1.createInstance(2), source, game);
            }
            else{
                source.addEffect(new BoostSourceEffect(2,2, Duration.EndOfTurn));
            }
            return true;
        }
        return false;
    }

    @Override
    public mage.cards.c.ChupacabraEffect copy() {
        return new mage.cards.c.ChupacabraEffect(this);
    }
}



