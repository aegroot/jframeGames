package com.simpleCombatGame.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.environment.occupants.Occupant;

public abstract class Block {
    final boolean canMoveTo;

    Occupant occupant;
    final Environment environment;
    final int x,y;

    public Block(boolean canMoveto, int x, int y, Environment environment) {
        this.canMoveTo = canMoveto;
        this.x = x;
        this.y = y;
        this.environment = environment;
        this.occupant =null;
    }
    public Block(int x, int y, boolean canMoveTo, Occupant occupant, Environment environment){
        this(canMoveTo, x,y, environment);
        this.occupant = occupant;
    }
    public Occupant getOccupant(){
        return occupant;
    }

    public void setOccupant(Occupant occupant) {
        this.occupant = occupant;
    }
}

