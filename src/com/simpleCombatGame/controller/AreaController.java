package com.simpleCombatGame.controller;

public interface AreaController {
     void scrollInDirection(int xDir, int yDir);
     void scrollTo(int xDir, int yDir, float movementTime);

     /*

     x*y camerazicht
      left=right horizontal sight
      upper, lower sight

     updateField(Context c)
     render(int xLower, int int yUpper, int xUpper, int xLower)

      */
}
