package org.mage.test.cards.continuous;

import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.BoostAllEffect;
import mage.constants.Duration;
import mage.constants.PhaseStep;
import mage.constants.Zone;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestMultiPlayerBaseWithRangeAll;

/**
 * @author JayDi85
 */
public class EndOfTurnMultiOpponentsTest extends CardTestMultiPlayerBaseWithRangeAll {

    String cardBear2 = EndOfTurnOneOpponentTest.cardBear2;

    @Test
    public void test_EndOfTurnMulti() {
        // Player order: A -> D -> C -> B
        addCustomCardWithAbility("boost1", playerA, new SimpleStaticAbility(Zone.ALL, new BoostAllEffect(1, 1, Duration.EndOfTurn)));

        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 1, playerA, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 2, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 3, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 4, playerB, true, null);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 5, playerA, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 6, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 7, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 8, playerB, true, null);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 9, playerA, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 10, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 11, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.EndOfTurn effect", 12, playerB, true, null);

        addCard(Zone.BATTLEFIELD, playerA, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerB, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerC, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerD, cardBear2, 1);

        attack(1, playerA, cardBear2);
        attack(2, playerD, cardBear2);
        attack(3, playerC, cardBear2);
        attack(4, playerB, cardBear2);
        //
        attack(5, playerA, cardBear2);
        attack(6, playerD, cardBear2);
        attack(7, playerC, cardBear2);
        attack(8, playerB, cardBear2);
        //
        attack(9, playerA, cardBear2);
        attack(10, playerD, cardBear2);
        attack(11, playerC, cardBear2);
        attack(12, playerB, cardBear2);

        setStopAt(12, PhaseStep.CLEANUP);
        setStrictChooseMode(true);
        execute();
        assertAllCommandsUsed();
    }

    @Test
    public void test_UntilYourNextTurnMulti() {
        // Player order: A -> D -> C -> B
        addCustomCardWithAbility("boost1", playerA, new SimpleStaticAbility(Zone.ALL, new BoostAllEffect(1, 1, Duration.UntilYourNextTurn)));

        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 1, playerA, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 2, playerD, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 3, playerC, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 4, playerB, true, PhaseStep.END_TURN);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 5, playerA, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 6, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 7, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 8, playerB, true, null);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 9, playerA, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 10, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 11, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilYourNextTurn effect", 12, playerB, true, null);

        addCard(Zone.BATTLEFIELD, playerA, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerB, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerC, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerD, cardBear2, 1);

        attack(1, playerA, cardBear2);
        attack(2, playerD, cardBear2);
        attack(3, playerC, cardBear2);
        attack(4, playerB, cardBear2);
        //
        attack(5, playerA, cardBear2);
        attack(6, playerD, cardBear2);
        attack(7, playerC, cardBear2);
        attack(8, playerB, cardBear2);
        //
        attack(9, playerA, cardBear2);
        attack(10, playerD, cardBear2);
        attack(11, playerC, cardBear2);
        attack(12, playerB, cardBear2);

        setStopAt(12, PhaseStep.CLEANUP);
        setStrictChooseMode(true);
        execute();
        assertAllCommandsUsed();
    }

    @Test
    public void test_UntilEndOfYourNextTurnMulti() {
        // Player order: A -> D -> C -> B
        addCustomCardWithAbility("boost1", playerA, new SimpleStaticAbility(Zone.ALL, new BoostAllEffect(1, 1, Duration.UntilEndOfYourNextTurn)));

        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 1, playerA, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 2, playerD, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 3, playerC, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 4, playerB, true, PhaseStep.END_TURN);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 5, playerA, true, PhaseStep.END_TURN);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 6, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 7, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 8, playerB, true, null);
        //
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 9, playerA, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 10, playerD, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 11, playerC, true, null);
        EndOfTurnOneOpponentTest.prepareStepChecks(this, "Duration.UntilEndOfYourNextTurn effect", 12, playerB, true, null);

        addCard(Zone.BATTLEFIELD, playerA, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerB, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerC, cardBear2, 1);
        addCard(Zone.BATTLEFIELD, playerD, cardBear2, 1);

        attack(1, playerA, cardBear2);
        attack(2, playerD, cardBear2);
        attack(3, playerC, cardBear2);
        attack(4, playerB, cardBear2);
        //
        attack(5, playerA, cardBear2);
        attack(6, playerD, cardBear2);
        attack(7, playerC, cardBear2);
        attack(8, playerB, cardBear2);
        //
        attack(9, playerA, cardBear2);
        attack(10, playerD, cardBear2);
        attack(11, playerC, cardBear2);
        attack(12, playerB, cardBear2);

        setStopAt(12, PhaseStep.CLEANUP);
        setStrictChooseMode(true);
        execute();
        assertAllCommandsUsed();
    }

}
