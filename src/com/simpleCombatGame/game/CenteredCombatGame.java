package com.simpleCombatGame.game;

import com.simpleCombatGame.controller.AreaController;

public class CenteredCombatGame extends CombatGame{


    public final int cameraWidth, cameraUpper,cameraLower;
    public AreaController controller;

    public CenteredCombatGame(int areaWidth, int areaHeight, int gameWidth, int gameHeight, int cameraLower, int startPositionx, int startPositiony, AreaController controller) {
        super(areaWidth,areaHeight,startPositionx,startPositiony,controller);
        this.cameraWidth = gameWidth;
        this.cameraUpper = gameHeight;
        this.cameraLower = cameraLower;;
    }

    @Override
    public void giveMovementCommand(MovementCommand command) {
        int xDir=0, yDir=0;
        switch (command){
            case up : yDir=1; break;
            case down:  yDir=-1; break;
            case left:  xDir=1; break;
            case right:  xDir=-1; break;

        }

    }
}
