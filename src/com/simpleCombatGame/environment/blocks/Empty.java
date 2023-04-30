package com.simpleCombatGame.environment.blocks;

public class Empty extends Block{
    public Empty(boolean canMoveto, int x, int y) {
        super(canMoveto, x, y, Environment.empty);
    }

    public Empty(int x, int y, Occupant occupant) {
        super(x, y, false, occupant, Environment.empty);
    }
}
