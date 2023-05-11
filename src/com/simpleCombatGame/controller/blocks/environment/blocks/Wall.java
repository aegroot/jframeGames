package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.Occupier;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

public class Wall extends Block{


    public Wall(int x, int y) {
        super(false, x, y, Environment.wall);
    }

    public Wall(int x, int y, Occupier occupier) {
        super(x, y, false, occupier, Environment.wall);
    }
}
