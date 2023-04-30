package com.simpleMazeGame.primsAlgorythm;

import com.simpleMazeGame.base.GameLayout;
import com.simpleMazeGame.base.occupants.PlaceState;

public class PrimsImplementation {

    private final  int xSize, ySize,  xBegin,  yBegin;
    GameLayout layout;

    public PrimsImplementation(int xBegin, int yBegin, GameLayout layout) {
        this.layout=layout;
        this.xSize = layout.getxSize();
        this.ySize = layout.getySize();
        this.xBegin = xBegin;
        this.yBegin = yBegin;
    }

    private PrimsVector[][] generateMaze(){
        PrimsVector[][] vectors=PrimsFunctions.generateDefaultList(xSize,ySize);

        PrimsFunctions functions=new PrimsFunctions(vectors,xSize,ySize,xBegin,yBegin);
        functions.occupy(xBegin,yBegin);
        int freeVectorsCount=functions.getFreeVectors().size();

        System.out.println(freeVectorsCount);
        while (freeVectorsCount>0){

            PrimsVector primsVector=functions.getRandomPrimVector(functions.getFreeVectors());
            functions.occupy(primsVector.getX(), primsVector.getY());
            freeVectorsCount=functions.getFreeVectors().size();
        }
        return functions.vectors;
    }

    private void implementMaze(PrimsVector[][] coordinates){
        for(int i=0; i<xSize; i++){
            for(int j=0; j<ySize; j++){
                if(coordinates[i][j].isOccupied()){
                    layout.changeOccupationOf(i,j, PlaceState.free);
                }
                else layout.changeOccupationOf(i,j,PlaceState.occupied);
            }
        }
        layout.changeOccupationOf(xBegin,yBegin,PlaceState.player);
    }
    public void execute(){
        PrimsVector[][] vectors=generateMaze();
        implementMaze(vectors);
    }

}
