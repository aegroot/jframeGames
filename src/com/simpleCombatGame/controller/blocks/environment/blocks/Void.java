package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

public class Void extends Block{
    public Void(int x, int y) {
        super(false, x, y, Environment.empty);
    }

}
