package com.simpleMazeGame.primsAlgorythm;

public class PrimsVector {
    private boolean occupied;

    private final int x;
    private final int y;

    public PrimsVector(int x, int y) {
        this.occupied = false;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
