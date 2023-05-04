package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

public class Void extends Block{
    public Void(int x, int y, Environment environment) {
        super(false, x, y, environment);
    }

    public Void(int x, int y, Occupant occupant, Environment environment) {
        super(x, y, false, occupant, environment);
    }
}
