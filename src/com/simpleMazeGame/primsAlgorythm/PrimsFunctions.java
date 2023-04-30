package com.simpleMazeGame.primsAlgorythm;

import java.util.ArrayList;

public class PrimsFunctions {
    PrimsVector[][]vectors;
    private final int xSize;
   private final int ySize;
    int xBegin;
    int yBegin;

    public PrimsFunctions(PrimsVector[][] vectors, int xSize, int ySize, int xBegin, int yBegin) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.xBegin = xBegin;
        this.yBegin = yBegin;
        this.vectors=vectors;
    }



    public int calculateGrowCost(int x, int y){
        int cost=0;
        cost+= checkOccupation(x + 1, y) ? 1:0;
        cost+= checkOccupation(x - 1, y) ? 1:0;
        cost+= checkOccupation(x , y+1) ? 1:0;
        cost+= checkOccupation(x ,y-1) ? 1:0;
        cost+=checkOccupation(x,y) ? 2:0;
        return  cost;
    }
   public  boolean checkOccupation(int x, int y){
        if((x<0||x>=xSize)||(y<0||y>=ySize)){return false; }
        return vectors[x][y].isOccupied();

   }

   public ArrayList<PrimsVector> getFreeVectors(){
        ArrayList<PrimsVector>primsVectors=new ArrayList<>();
       for(int i=0; i<xSize; i++){
           for(int j=0; j<ySize; j++){
               if(calculateGrowCost(i,j)==1){
                   primsVectors.add(vectors[i][j]);
               }
           }
       }
        return  primsVectors;
   }
   public PrimsVector getRandomPrimVector(ArrayList<PrimsVector> primList){
        int targIndex= (int) (Math.random() * (primList.size()-1));

        return primList.get(targIndex);
   }

    public PrimsVector[][] getVectors() {
        return vectors;
    }
    public static PrimsVector[][] generateDefaultList(int x, int y){
        PrimsVector[][]defaultVectors=new PrimsVector[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                defaultVectors[i][j]=new PrimsVector(i,j);
            }
        }
        return  defaultVectors;

    }
    public void occupy(int x, int y){

        vectors[x][y].setOccupied(true);

    }
}
