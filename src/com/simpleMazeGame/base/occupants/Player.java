package com.simpleMazeGame.base.occupants;

import com.simpleMazeGame.base.GameLayout;
import com.simpleMazeGame.base.Occupant;

public class Player extends Occupant {
    int x;
    int y;

    public Player(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println(x+" : "+y);
    }
    public  boolean upAction(GameLayout layout){
        return layout.canMoveTo(x-1, y);
    }
    public  boolean downAction(GameLayout layout){
        return layout.canMoveTo(x+1, y);
        }
    public boolean rightAction(GameLayout layout){
        return layout.canMoveTo(x, y+1);
    }
    public boolean leftAction(GameLayout layout){
        return layout.canMoveTo(x, y-1);

        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y){
        this.x=x;
        this.y=y;

        System.out.println(x+" : "+ y);
    }
}
