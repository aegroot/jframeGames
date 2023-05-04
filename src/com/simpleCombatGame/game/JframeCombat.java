package com.simpleCombatGame.game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JframeCombat extends JFrame implements KeyListener {


    private final CenteredCombatGame game;


    public JframeCombat(CenteredCombatGame game){

        this.game = game;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
