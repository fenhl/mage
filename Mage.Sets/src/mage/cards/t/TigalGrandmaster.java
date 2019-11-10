package mage.cards.t;

import mage.MageInt;
import mage.MageObjectReference;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.abilities.keyword.FlashAbility;
import mage.abilities.keyword.ProwessAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.filter.predicate.mageobject.ConvertedManaCostPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.players.Player;
import mage.target.common.TargetCardInYourGraveyard;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

public final class TigalGrandmaster extends CardImpl {

    private static final FilterInstantOrSorceryCard filter = new FilterInstantOrSorceryCard("instant or sorcery card with converted mana cost 2 or less");
    static {
        filter.add(new ConvertedManaCostPredicate(ComparisonType.FEWER_THAN, 3));
    }

    public TigalGrandmaster(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}{U}");
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.MONK);

        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Flash
        this.addAbility(FlashAbility.getInstance());
        this.addAbility(new ProwessAbility());

        // When Tigal, Grandmaster enters the battlefield, you may cast target isntat or sorcery card with
        // converted mana cost 2 or less from your graveyard without paying its mana cost. If that card would
        // be put into your graveyard this way, exile it instead.

        Ability ability = new EntersBattlefieldTriggeredAbility(new TigalGrandmasterEffect());
        ability.addTarget(new TargetCardInYourGraveyard(filter));
        this.addAbility(ability);
    }

    public TigalGrandmaster(final TigalGrandmaster card) {
        super(card);
    }

    @Override
    public TigalGrandmaster copy() {
        return new TigalGrandmaster(this);
    }

}

class TigalGrandmasterEffect extends OneShotEffect {

    TigalGrandmasterEffect(){
        super(Outcome.Benefit);
        this.staticText = "you may cast target instant or sorcery card with converted mana cost 2 or less from your graveyard without paying its mana cost."
                + "If that card woudl be put into your graveyard this turn, exile it instead.";
    }

    TigalGrandmasterEffect(final TigalGrandmasterEffect effect) {
        super(effect);
    }

    @Override
    public TigalGrandmasterEffect copy() {
        return new TigalGrandmasterEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Card card = game.getCard(this.getTargetPointer().getFirst(game, source));
            if (card != null){
                if (controller.chooseUse(outcome, "Cast " + card.getLogName() + "?", source, game)) {
                    if (controller.cast(card.getSpellAbility(), game, true, new MageObjectReference(source.getSourceObject(game), game))) {
                        ContinuousEffect effect = new TigalGrandmasterReplacementEffect(card.getId());
                        effect.setTargetPointer(new FixedTarget(card.getId(), game.getState().getZoneChangeCounter(card.getId())));
                        game.addEffect(effect, source);
                    }
                }
            }
            return true;
        }
        return false;
    }
}

class TigalGrandmasterReplacementEffect extends ReplacementEffectImpl {

    private final UUID cardId;

    TigalGrandmasterReplacementEffect(UUID cardId) {
        super(Duration.EndOfTurn, Outcome.Exile);
        this.cardId = cardId;
        staticText = "If that card would be put into your graveyard this turn, exile it instead.";
    }

    TigalGrandmasterReplacementEffect(final TigalGrandmasterReplacementEffect effect){
        super(effect);
        this.cardId = effect.cardId;
    }

    @Override
    public TigalGrandmasterReplacementEffect copy() {
        return new TigalGrandmasterReplacementEffect(this);
    }

    @Override
    public boolean replaceEvent(GameEvent event,Ability source, Game game) {
        Player controller = game.getPlayer(source.getControllerId());
        Card card = game.getCard(this.cardId);
        if (controller != null && card != null) {
            controller.moveCardToExileWithInfo(card, null, "", source.getSourceId(), game, Zone.STACK, true);
            return true;
        }
        return false;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
        return zEvent.getToZone() == Zone.GRAVEYARD && zEvent.getTargetId().equals(this.cardId);
    }

}
