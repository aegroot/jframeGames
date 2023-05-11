package com.simpleCombatGame.game;

import com.simpleCombatGame.controller.AreaController;
import com.simpleCombatGame.controller.blocks.environment.blocks.Block;

import java.awt.*;

public class CenteredCombatGame extends CombatGame{


    public final int cameraWidth, cameraUpper,cameraLower;

    public CenteredCombatGame(int cameraWidth, int camaraHeight, int cameraLower, int startPositionx, int startPositiony, Block[][] blocks) {
        super(blocks.length,blocks[0].length,startPositionx,startPositiony,new AreaController(startPositionx,startPositiony,blocks));
        this.cameraWidth = cameraWidth;
        this.cameraUpper = camaraHeight;
        this.cameraLower = cameraLower;
    }

    @Override
    public void giveMovementCommand(MovementCommand command) {
        int xDir=0, yDir=0;
        switch (command) {
            case UP -> yDir = 1;
            case DOWN -> yDir = -1;
            case LEFT -> xDir = 1;
            case RIGHT -> xDir = -1;
        }
        controller.movePlayer(xDir,yDir);
    }
    public Color[][]renderGame(){
        int upperBounds= controller.getPlayerY()+cameraUpper+1;
        int lowerBounds= controller.getPlayerY()-cameraLower;
        int rightBounds= controller.getPlayerX()-cameraWidth;
        int leftBounds= controller.getPlayerX()+cameraWidth+1;

        return controller.getSnapShot(upperBounds, lowerBounds, leftBounds, rightBounds);
    }
   int getcameraHeight(){
        return cameraUpper+cameraLower+1;
   }
    int getCameraWidth(){
        return cameraWidth*2+1;
    }
}

