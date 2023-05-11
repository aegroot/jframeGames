package com.simpleCombatGame.controller.blocks.environment.occupants;

import com.simpleCombatGame.controller.blocks.Occupier;

public class Enemy extends Occupant{
    public Enemy() {
        super(Occupier.enemy);
    }

    @Override
    void collisionEvent() {

    }

    @Override
    void destroyInstance() {

    }
}
