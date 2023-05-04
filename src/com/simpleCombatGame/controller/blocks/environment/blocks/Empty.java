package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

public class Empty extends Block{
    public Empty(boolean canMoveto, int x, int y) {
        super(canMoveto, x, y, Environment.empty);
    }

    public Empty(int x, int y, Occupant occupier) {
        super(x, y, false, occupier, Environment.empty);
    }
}
