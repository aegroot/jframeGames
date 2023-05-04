package com.simpleCombatGame.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.environment.occupants.Occupant;

public class Ground extends Block{

    public Ground(boolean canMoveto, int x, int y) {
        super(true, x, y, Environment.ground);
    }

    public Ground(int x, int y, boolean canMoveTo, Occupant occupier) {
        super(x, y, true, occupier, Environment.ground);
    }
}
