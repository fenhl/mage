package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.LongestStraight;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;


/**
 *
 *
 * @author Eike Peace
 */
public final class CarnivalIllusionist extends CardImpl {

    public CarnivalIllusionist(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{U}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        Ability ability = (new EntersBattlefieldTriggeredAbility(new CarnivalIllusionistEffect(new LongestStraight())));
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }


    public CarnivalIllusionist(final CarnivalIllusionist card) {
        super(card);
    }

    @Override
    public CarnivalIllusionist copy() {
        return new CarnivalIllusionist(this);
    }
}

class CarnivalIllusionistEffect extends OneShotEffect {
    protected DynamicValue straight;

    public CarnivalIllusionistEffect(DynamicValue straight){
        super(Outcome.Benefit);
        this.staticText = "put target creature into its owner's library just beneath the top X cards of that library, where X is your longest straight";

    }

    public CarnivalIllusionistEffect(final mage.cards.c.CarnivalIllusionistEffect effect) {
        super(effect);
    }

    @Override
    public mage.cards.c.CarnivalIllusionistEffect copy() {
        return new mage.cards.c.CarnivalIllusionistEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {
            Permanent permanent = game.getPermanent(getTargetPointer().getFirst(game, source));
            if (permanent != null) {
                int under = new LongestStraight().calculate(game, source, this);
                controller.putCardOnTopXOfLibrary(permanent, game, source, 1 + under);
            }
            return true;
        }
        return false;
    }
}
