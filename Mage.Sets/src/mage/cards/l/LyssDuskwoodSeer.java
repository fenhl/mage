package mage.cards.l;

import mage.MageInt;
import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.OneShotEffect;
import mage.cards.*;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.common.TargetCardInLibrary;
import mage.target.common.TargetControlledCreaturePermanent;

import java.util.UUID;

/**
 * @author EikePeace
 */

public final class LyssDuskwoodSeer extends CardImpl {

    private static final FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent("another creature");
    static{
        filter.add(AnotherPredicate.instance);
    }

    public LyssDuskwoodSeer(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}{G}");
        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.SATYR, SubType.SHAMAN);


        this.power = new MageInt(3);
        this.toughness = new MageInt(2);

        Ability ability = new SimpleActivatedAbility(new LyssDuskwoodSeerEffect(), new TapSourceCost());
        ability.addCost(new PayLifeCost(3));
        ability.addCost(new SacrificeTargetCost(new TargetControlledCreaturePermanent(filter)));
        this.addAbility(ability);
    }


    public LyssDuskwoodSeer(final LyssDuskwoodSeer card) {
        super(card);
    }

    @Override
    public LyssDuskwoodSeer copy() {
        return new LyssDuskwoodSeer(this);
    }
}

class LyssDuskwoodSeerEffect extends OneShotEffect {

    public LyssDuskwoodSeerEffect() {
        super(Outcome.PutCreatureInPlay);
        this.staticText = "Search your library for a creature card and reveal it." +
                " If a Satyr card is revealed this way, put it onto the battlefield. " +
                "Otherwise put it into your hand. Then shuffle your library";
    }

    public LyssDuskwoodSeerEffect(final LyssDuskwoodSeerEffect effect) {
        super(effect);
    }

    @Override
    public LyssDuskwoodSeerEffect copy() {
        return new LyssDuskwoodSeerEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        MageObject sourceObject = source.getSourceObject(game);
        if (sourceObject != null && controller != null) {
            TargetCardInLibrary target = new TargetCardInLibrary(StaticFilters.FILTER_CARD_CREATURE);
            if (controller.searchLibrary(target, source, game)) {
                Card card = controller.getLibrary().getCard(target.getFirstTarget(), game);
                if (card != null) {
                    Cards cards = new CardsImpl(card);
                    if (card.hasSubtype(SubType.SATYR, game)) {
                        controller.moveCards(card, Zone.BATTLEFIELD, source, game);
                    } else {
                        controller.moveCards(card, Zone.HAND, source, game);
                    }
                    controller.revealCards(sourceObject.getIdName(), cards, game);
                }
            }
            controller.shuffleLibrary(source, game);
            return true;
        }
        return false;
    }
}