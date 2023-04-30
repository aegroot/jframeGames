package com.simpleCombatGame.environment.blocks;

public class Ground extends Block{

    public Ground(boolean canMoveto, int x, int y) {
        super(true, x, y, Environment.ground);
    }

    public Ground(int x, int y, boolean canMoveTo, Occupant occupant) {
        super(x, y, true, occupant, Environment.ground);
    }
}
