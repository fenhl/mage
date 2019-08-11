package mage.cards.d;

import mage.abilities.effects.common.PutOnLibraryTargetEffect;
import mage.abilities.keyword.ReflexAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 *
 *
 * @author EikePeace
 */

public final class DriveOff extends CardImpl {
    public DriveOff(UUID ownerId, CardSetInfo setInfo){
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{U}");
        this.getSpellAbility().addEffect(new PutOnLibraryTargetEffect(true));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());

        this.addAbility(new ReflexAbility(this, "{4}{U}"));
    }

    public DriveOff(final DriveOff card){
        super(card);
    }

    @Override
    public DriveOff copy(){
        return new DriveOff(this);
    }
}
