package com.simpleCombatGame;

import com.simpleCombatGame.controller.AreaController;
import com.simpleCombatGame.game.CenteredCombatGame;
import com.simpleCombatGame.game.JframeCombat;

public class Main {
    public static void main(String[] args) {
        CenteredCombatGame game=new CenteredCombatGame(2,2,2,1,1, AreaController.generateSampleArea());
        new JframeCombat(game);

    }
}
