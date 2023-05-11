package com.simpleMazeGame.gui;

import com.simpleMazeGame.base.Coordinate;
import com.simpleMazeGame.base.GameLayout;
import com.simpleMazeGame.base.occupants.PlaceState;
import com.simpleMazeGame.base.occupants.Player;
import com.simpleMazeGame.primsAlgorythm.PrimsImplementation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainFrame extends JFrame implements KeyListener {
    private  final Color playerColor=Color.GREEN;
    private  final Color wallColor=Color.black;
    private final Color pathColor=Color.white;
    private  final  Color emptyColor=Color.PINK;
    public   final int x;
    public   final  int y;
    private  final  int gap;

    private final JPanel[][]panels;

    public  final GameLayout layout;
    Player player;

    public MainFrame(int x, int y, int gap){
        this.x = x;
        this.y = y;
        this.gap = gap;


        addKeyListener(this);
        layout=new GameLayout(x,y);
        panels=new JPanel[x][y];
        createAndShow();
    }

    private  void createAndShow(){
        this.setSize(x*50,y*50);
        this.setLayout(new GridLayout(x,y,gap,gap));
        //MazeGeneration mazeGeneration=new MazeGeneration(layout);
        //mazeGeneration.generateMaze();
        //Coordinate beginCord=mazeGeneration.getBeginC();
        Coordinate beginCord=new Coordinate(0,1);
        player=new Player(beginCord.getX(),beginCord.getY());
        new PrimsImplementation(beginCord.getX(),beginCord.getY(),layout).execute();
        initialize();
        //fillSpace();
        //randomizeLevel(wallColor,8,pathColor,4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);}

    private  void initialize(){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                JPanel panel=new JPanel();
                panels[i][j]=panel;
                switch (layout.getBlocks()[i][j].getStatus()) {
                    case free -> panel.setBackground(pathColor);
                    case occupied -> panel.setBackground(wallColor);
                    case player -> panel.setBackground(playerColor);
                    case empty -> panel.setBackground(emptyColor);
                }
                add(panel);
            }
        }
    }
    private void fillSpace(){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                JPanel panel=new JPanel();
                panels[i][j]=panel;
                panel.setBackground(pathColor);
                add(panel);
            }
        }
    }

    private void randomizeLevel(Color c1,int r1, Color c2,int r2){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
               double rand=Math.random();
               double res=rand*(r1+r2);

               if(res<=r1){
                   //layout.changeOccupationOf(i,j, PlaceState.occupied);
                   panels[i][j].setBackground(c1);
               }
               else {
                   panels[i][j].setBackground(c2);
                   layout.changeOccupationOf(i,j,PlaceState.free);
               }
            }}
        panels[player.getX()][player.getY()].setBackground(playerColor);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode=e.getKeyCode();
        if(keycode == KeyEvent.VK_RIGHT && player.rightAction(layout)){
            movePlayer(player.getX(),player.getY()+1);
        }
        else if(keycode == KeyEvent.VK_LEFT&& player.leftAction(layout)){
            movePlayer(player.getX(),player.getY()-1);

        }
        else if(keycode == KeyEvent.VK_UP && player.upAction(layout)){
            movePlayer(player.getX()-1,player.getY());
        }
        else if(keycode == KeyEvent.VK_DOWN && player.downAction(layout)){
            movePlayer(player.getX()+1,player.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    private void movePlayer(int x, int y){

        panels[player.getX()][player.getY()].setBackground(pathColor);
        layout.changeOccupationOf(player.getX(), player.getY(), PlaceState.free);
        panels[x][y].setBackground(playerColor);

        player.move(x,y);
        layout.changeOccupationOf(x,y,PlaceState.player);
    }
}
