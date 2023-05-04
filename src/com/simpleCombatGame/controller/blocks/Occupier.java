package com.simpleCombatGame.controller.blocks;

import java.awt.*;

public enum Occupier implements BlockFunctions {
    player(Color.cyan),enemy(Color.red),item(Color.green),none(Color.white),event(Color.red);

    private final Color color;

    Occupier(Color color) {
        this.color=color;
    }

    @Override
    public Color getColor() {
        return  color;
    }
}
