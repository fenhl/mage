package mage.cards.t;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.ActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousEffectImpl;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.common.FilterArtifactCard;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.filter.predicate.permanent.AnotherPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.UUID;

public final class TheNetwork extends CardImpl {

    public TheNetwork(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE},"{7");
        this.addSuperType(SuperType.LEGENDARY);

        this.subtype.add(SubType.AVATAR);
        this.power = new MageInt(7);
        this.toughness = new MageInt(7);

        this.addAbility(new SimpleStaticAbility(new TheNetworkEffect()));

    }

    public TheNetwork(final TheNetwork card) {
        super(card);
    }

    @Override
    public TheNetwork copy() {
        return new TheNetwork(this);
    }

}

class TheNetworkEffect extends ContinuousEffectImpl {

    private static final FilterControlledArtifactPermanent filter = new FilterControlledArtifactPermanent();
    static {
        filter.add(AnotherPredicate.instance);
    }

    public TheNetworkEffect() {
        super(Duration.WhileOnBattlefield, Layer.AbilityAddingRemovingEffects_6, SubLayer.NA, Outcome.AddAbility);
        staticText = "Artifacts you control have all activated abilities of each other artifact you control and of each artifact card in your graveyard.";
    }

    public TheNetworkEffect(final TheNetworkEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {

        for (Permanent perm : game.getState().getBattlefield().getActivePermanents(
                new FilterControlledArtifactPermanent(), source.getControllerId(), source.getSourceId(), game)) {
            if (perm != null) {
                for (Permanent artifact : game.getState().getBattlefield().getActivePermanents(
                        filter, source.getControllerId(), source.getSourceId(), game)) {
                    for (Ability ability : artifact.getAbilities()) {
                        if (ability instanceof ActivatedAbility) {
                            perm.addAbility(ability, source.getSourceId(), game);
                        }
                    }
                }
                for (Card artifactCard : game.getPlayer(source.getControllerId()).getGraveyard().getCards(
                        new FilterArtifactCard(), game)) {
                    for (Ability ability : artifactCard.getAbilities()) {
                        if (ability instanceof ActivatedAbility){
                            perm.addAbility(ability, source.getSourceId(), game);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public TheNetworkEffect copy() {
        return new TheNetworkEffect(this);
    }

}