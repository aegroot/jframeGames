package com.simpleCombatGame.environment.blocks;

public class Wall extends Block{


    public Wall(int x, int y) {
        super(false, x, y, Environment.wall);
    }

    public Wall(int x, int y, Occupant occupant) {
        super(x, y, false, occupant, Environment.wall);
    }
}
