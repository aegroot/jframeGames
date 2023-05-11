package com.simpleCombatGame.controller.blocks.environment.blocks;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.Occupier;

import java.awt.*;

public abstract class Block {
    final boolean canMoveTo;

    Occupier occupant;
    final Environment environment;
    final int x,y;

    public Block(boolean canMoveto, int x, int y, Environment environment) {
        this.canMoveTo = canMoveto;
        this.x = x;
        this.y = y;
        this.environment = environment;
        this.occupant =Occupier.none;
    }
    public Block(int x, int y, boolean canMoveTo, Occupier occupant, Environment environment){
        this(canMoveTo, x,y, environment);
        this.occupant = occupant;
    }
    public Occupier getOccupant(){
        return occupant;
    }

    public void setOccupant(Occupier occupant) {
        this.occupant = occupant;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public boolean isCanMoveTo() {
        return canMoveTo;
    }
    public Color getOuterColor(){
        return occupant!= Occupier.none?occupant.getColor() :environment.getColor();
    }
}

