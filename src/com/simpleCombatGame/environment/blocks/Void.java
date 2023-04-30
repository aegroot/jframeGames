package com.simpleCombatGame.environment.blocks;

public class Void extends Block{
    public Void(int x, int y, Environment environment) {
        super(false, x, y, environment);
    }

    public Void(int x, int y, Occupant occupant, Environment environment) {
        super(x, y, false, occupant, environment);
    }
}
