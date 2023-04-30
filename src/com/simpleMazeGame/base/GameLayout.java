package com.simpleMazeGame.base;

import com.simpleMazeGame.base.occupants.PlaceState;
;

public class GameLayout {


    private final int xSize;
    private final int ySize;
    private Coordinate[][] coordinates;

    public GameLayout(int xSize, int ySize) {
        this.xSize=xSize;
        this.ySize=ySize;

        this.coordinates =new Coordinate[xSize][ySize];

        for(int i=0; i<xSize; i++){
            for(int j=0; j<ySize; j++){
                coordinates[i][j]=new Coordinate(i,j);
            }
        }
    }

    public Coordinate[][] getBlocks() {
        return coordinates;
    }
    public  void changeOccupationOf(int x, int y, PlaceState p){
        coordinates[x][y].setStatus(p);
    }
    public boolean canMoveTo(int x,int y){
        if(x>=xSize||y>=ySize||x<0||y<0){return  false;}
        return coordinates[x][y].getStatus()==PlaceState.free;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }
}
