package com.simpleCombatGame.controller;

import com.simpleCombatGame.controller.blocks.environment.blocks.Block;

public interface AreaController {
     void scrollInDirection(int xDir, int yDir);
     void scrollTo(int xDir, int yDir, float movementTime);
     void movePlayer(int xDir, int yDir);

     void teleportPlayer(int xTo, int yTo);

     Block[][]getArea();

     /*
     x*y camerazicht
      left=right horizontal sight
      upper, lower sight

     updateField(Context c)
     render(int xLower, int int yUpper, int xUpper, int xLower)

      */
}
