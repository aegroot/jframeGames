package com.simpleMazeGame.primsAlgorythm;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PrimsFunctionsTest {
    static PrimsFunctions functions;

    @BeforeEach
    void setup(){
        PrimsVector[][] vectors=PrimsFunctions.generateDefaultList(8,8);
        functions=new PrimsFunctions(vectors,8,8,1,1);

        //functions.occupy(4,4);
        //functions.occupy(5,4);
        //functions.occupy(6,4);
        //functions.occupy(6,5);


    }

    @org.junit.jupiter.api.Test
    void calculateGrowCost() {
       assertEquals(functions.calculateGrowCost(1,5),0);
        assertEquals(functions.calculateGrowCost(0,0),0);
        assertEquals(functions.calculateGrowCost(3,4),1);
        assertEquals(functions.calculateGrowCost(6,4),4);
        assertEquals(functions.calculateGrowCost(10,-5),0);
    }

    @org.junit.jupiter.api.Test
    void checkOccupation() {
        assertFalse(functions.checkOccupation(6, 6));
        assertTrue(functions.checkOccupation(6,5));
        assertFalse(functions.checkOccupation(9,-6));
    }

    @org.junit.jupiter.api.Test
    void getFreeVectors() {

        functions.occupy(0,5);
        System.out.println(functions.getFreeVectors().size());
        //assertEquals(functions.getFreeVectors().size(),8);
       // functions.occupy(3,4);
        //assertEquals(functions.getFreeVectors().size(),10);
    }



}