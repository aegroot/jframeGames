package com.simpleCombatGame.controller;

import com.simpleCombatGame.controller.blocks.Environment;
import com.simpleCombatGame.controller.blocks.Occupier;
import com.simpleCombatGame.controller.blocks.environment.blocks.Block;
import com.simpleCombatGame.controller.blocks.environment.blocks.Ground;
import com.simpleCombatGame.controller.blocks.environment.blocks.Wall;
import com.simpleCombatGame.controller.blocks.environment.occupants.Enemy;
import com.simpleCombatGame.controller.blocks.environment.occupants.Occupant;

import java.awt.*;

public class AreaController {

     private int playerX,playerY;
     private Block[][] area;

     public AreaController(int x, int y, Block[][] area) {
          this.playerX = x;
          this.playerY = y;
          this.area = area;
     }


     public void movePlayer(int xDir, int yDir) {
         if(area[playerX+xDir][playerY+yDir].isCanMoveTo()){

             System.out.println("yes");

             area[playerX][playerY].setOccupant(Occupier.none);

             playerX+=xDir;
             playerY+=yDir;

             area[playerX][playerY].setOccupant(Occupier.player);
         }

     }


     public Color[][] getSnapShot(int upperBounds, int lowerBounds, int leftBounds, int rightBounds){

         int width=Math.abs(leftBounds-rightBounds);
         int height=Math.abs(upperBounds-lowerBounds);

         //System.out.println(width+": "+height);

         Color[][]blocks=new Color[width][height];
         for(int i=0; i<height; i++){
             for (int j = 0; j <width; j++) {
                 int xTarget=width+j-1;
                 int yTarget=height+i-1;


                 //System.out.println(xTarget+":"+yTarget);

                 if(yTarget>=area[0].length | xTarget>= area.length | xTarget<0| yTarget<0 ){
                     blocks[j][i]= Environment.empty.getColor();
                 }
                 else blocks[j][i]= area[xTarget][yTarget].getOuterColor();
             }
         }

         return blocks;
     }
     public static Block[][]generateSampleArea(){

         Block[][] blocks = {
                 {new Wall(0, 0), new Wall(0, 1), new Wall(0, 1), new Wall(0, 1)},
                 {new Wall(1, 0), new Ground(1, 1), new Ground(1, 2), new Wall(1, 3)},
                 {new Wall(2, 0), new Ground(2, 1), new Ground(2, 2), new Wall(2, 3)},
                 {new Wall(3, 3), new Wall(3, 1), new Wall(3, 1), new Wall(3, 1)}};

         blocks[1][1].setOccupant(Occupier.enemy);


         return blocks;
     }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }
}
