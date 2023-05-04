package com.simpleCombatGame.environment.occupants;

import com.simpleCombatGame.controller.blocks.Occupier;

public abstract class Occupant {
    public final Occupier occupier;

    public Occupant(Occupier occupier) {
        this.occupier = occupier;
    }

    abstract void collisionEvent();
    abstract void destroyInstance();
}
