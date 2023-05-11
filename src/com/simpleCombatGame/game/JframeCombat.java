package com.simpleCombatGame.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JframeCombat extends JFrame implements KeyListener {

    JPanel[][] panels;

   final int width;
    final int height;


    private final CenteredCombatGame game;


    public JframeCombat(CenteredCombatGame game){
        addKeyListener(this);

        this.game = game;


        height =game.getcameraHeight();
        width=game.getCameraWidth();
        this.panels=new JPanel[width][height];

        this.setSize(width, height);
        this.setLayout(new GridLayout(width,height,1,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                JPanel panel=new JPanel();
                panels[i][j]=panel;
                add(panel);
            }
        }
        render();

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int keycode=keyEvent.getKeyCode();
        MovementCommand command = switch (keycode) {
            case KeyEvent.VK_RIGHT -> MovementCommand.RIGHT;
            case KeyEvent.VK_LEFT -> MovementCommand.LEFT;
            case KeyEvent.VK_UP -> MovementCommand.UP;
            case KeyEvent.VK_DOWN -> MovementCommand.DOWN;
            default -> null;
        };

        assert command != null;

        System.out.println(command);
        game.giveMovementCommand(command);

        render();

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
    void render(){

        Color[][] colors= game.renderGame();

        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                panels[i][j].setBackground(colors[i][j]);
            }
        }

    }
}
