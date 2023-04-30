package com.simpleMazeGame.base;

import com.simpleMazeGame.base.occupants.PlaceState;

public class Coordinate {
    private Occupant occupant;
    private PlaceState status;


    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        status= PlaceState.free;
    }

    public void setOccupant(Occupant occupant) {
        this.occupant = occupant;
    }

    public Occupant getOccupant() {
        return occupant;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setStatus(PlaceState status) {
        this.status = status;
    }

    public PlaceState getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return status.toString();
    }
}
