package com.simpleMazeGame.maze;

import com.simpleMazeGame.base.Coordinate;
import com.simpleMazeGame.base.GameLayout;
import com.simpleMazeGame.base.occupants.PlaceState;
import java.util.ArrayList;

public class MazeGeneration {

    private int endX,endY;
    private  Coordinate beginC;
    GameLayout layout;

    public MazeGeneration(GameLayout layout) {
        this.layout=layout;
    }

    public  void generateMaze(){
        ArrayList<Coordinate>cords=new ArrayList<>();
        fillEdges(cords);
        chooseBeginSimple(cords);

    }

    private  void chooseBeginSimple(ArrayList<Coordinate> coordinates){
        int index= (int) (Math.random()* coordinates.size()-1);
        beginC= coordinates.get(index);
        beginC.setStatus(PlaceState.player);
    }
    private void fillEdges(ArrayList<Coordinate> coordinates){
        for (int i = 0; i <layout.getxSize() ; i++) {
            layout.changeOccupationOf(i,0, PlaceState.occupied);
            layout.changeOccupationOf(i, layout.getySize() -1,PlaceState.occupied);
            coordinates.add(layout.getBlocks()[i][0]);
            coordinates.add(layout.getBlocks()[i][layout.getySize()-1]);
        }

        for (int i = 0; i <layout.getySize() ; i++) {
            layout.changeOccupationOf(0,i, PlaceState.occupied);
            layout.changeOccupationOf(layout.getxSize() -1,i,PlaceState.occupied);
            coordinates.add(layout.getBlocks()[0][i]);
            coordinates.add(layout.getBlocks()[layout.getxSize()-1][i]);
        }
    }

    public Coordinate getBeginC() {
        return beginC;
    }
    private  void fillMaze(){

    }

}
