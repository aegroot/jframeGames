package com.simpleCombatGame.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.environment.occupants.Occupant;

public class Wall extends Block{


    public Wall(int x, int y) {
        super(false, x, y, Environment.wall);
    }

    public Wall(int x, int y, Occupant occupier) {
        super(x, y, false, occupier, Environment.wall);
    }
}
