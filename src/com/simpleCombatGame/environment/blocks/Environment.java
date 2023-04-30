package com.simpleCombatGame.environment.blocks;

import java.awt.*;

public enum Environment implements BlockFunctions{
    empty (Color.black),wall(Color.GRAY),ground(Color.ORANGE);

    private final Color color;

     Environment(Color color){
        this.color=color;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
