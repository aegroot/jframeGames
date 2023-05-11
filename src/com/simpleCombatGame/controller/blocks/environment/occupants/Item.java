package com.simpleCombatGame.controller.blocks.environment.occupants;

import com.simpleCombatGame.controller.blocks.Occupier;

public class Item extends Occupant{
    public Item() {
        super(Occupier.item);
    }

    @Override
    void collisionEvent() {
    }

    @Override
    void destroyInstance() {

    }
}
