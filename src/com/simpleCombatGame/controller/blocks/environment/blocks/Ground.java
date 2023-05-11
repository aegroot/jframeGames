package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.Occupier;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

public class Ground extends Block{

    public Ground( int x, int y) {
        super(true, x, y,Environment.ground);
    }

    public Ground(int x, int y, Occupier occupier) {
        super(x, y, true, occupier, Environment.ground);
    }
}
