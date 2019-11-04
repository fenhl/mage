package mage.game.permanent.token;

import mage.abilities.Ability;
import mage.abilities.common.ActivateIfConditionActivatedAbility;
import mage.abilities.condition.common.MyTurnCondition;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.target.TargetPermanent;

public final class CanisterToken extends TokenImpl {

    public CanisterToken() {
        super("Canister", "colorless artifact Canister Token with \"{T}, Sacrifice this artifact\"" +
                        ": Untap target permanent. Activate this ability only during your turn.");
        cardType.add(CardType.ARTIFACT);
        subtype.add(SubType.CANISTER);

        Ability canisterAbility = new ActivateIfConditionActivatedAbility(Zone.BATTLEFIELD, new UntapTargetEffect(),
                new TapSourceCost(), MyTurnCondition.instance);
        canisterAbility.addTarget(new TargetPermanent());
        canisterAbility.addCost(new SacrificeSourceCost());
        this.addAbility(canisterAbility);
    }

    public CanisterToken(final CanisterToken token) {
        super(token);
    }

    public CanisterToken copy() {
        return new CanisterToken(this);
    }
}
