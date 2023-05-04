package com.simpleCombatGame.game;

import com.simpleCombatGame.controller.AreaController;

public abstract class CombatGame {

    public final int areaWidth,areaHeight, startPositionX,startPositionY;
    public AreaController controller;

    protected CombatGame(int areaWidth, int areaHeight, int startPositionX, int startPositionY, AreaController controller) {
        this.areaWidth = areaWidth;
        this.areaHeight = areaHeight;
        this.startPositionX = startPositionX;
        this.startPositionY = startPositionY;
        this.controller=controller;
    }

    public abstract void giveMovementCommand(MovementCommand command);
}
