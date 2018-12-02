/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mage.abilities.dynamicvalue.common;

import java.util.*;

import mage.abilities.Ability;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.Effect;
import mage.filter.common.FilterNonlandPermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;

/**
 * Each colored mana symbol (e.g. {U}) in the mana costs of permanents you
 * control counts toward your devotion to that color.
 *
 * @author LevelX2
 */
public class LongestStraight implements DynamicValue {

    private FilterNonlandPermanent noLand = new FilterNonlandPermanent();

    @Override
    public int calculate(Game game, Ability sourceAbility, Effect effect) {
        ArrayList<Integer> cmcList = new ArrayList<Integer>();

        int straight = 0;
        for (Permanent permanent : game.getBattlefield().getAllActivePermanents(noLand, sourceAbility.getControllerId(), game)) {
            int cmc = permanent.getConvertedManaCost();
            cmcList.add(cmc);
        }
        if (cmcList.size() == 0) {
            straight = 0;}
        else if (cmcList.size() == 1) {
            straight = 1;}
        else if (cmcList.size() > 1) {
            Collections.sort(cmcList);
            Set st = new HashSet();
            st.addAll(cmcList);
            cmcList.clear();
            cmcList.addAll(st);
            straight = 1;
            for (int i = 1; i < cmcList.size(); i++) {
                if (cmcList.get(i) == cmcList.get(i - 1) + 1) {
                    straight++;
                } else straight = 1;
            }
        }
        return straight;
    }

    @Override
    public LongestStraight copy() {
        return new LongestStraight();
    }

    @Override
    public String toString() {
        return "X";
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Card your longest Straight");
        return sb.toString();
    }
}