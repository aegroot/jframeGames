package com.simpleCombatGame.environment.blocks;

import java.awt.*;

public enum Occupant implements BlockFunctions{
    player (Color.cyan),enemy(Color.red),item(Color.green);

    private final Color color;

    Occupant(Color color) {
        this.color=color;
    }

    @Override
    public Color getColor() {
        return  color;
    }
}
