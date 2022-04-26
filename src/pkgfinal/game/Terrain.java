/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.game;

import java.util.Random;

/**
 *
 * @author Farooq Ameen
 */
public class Terrain {

    String terrain;

    Terrain() {
        Random rand = new Random();
        int random;
        random = rand.nextInt(4);
        switch (random) {
            case (0):
                terrain = "desert";
                break;
            case (1):
                terrain = "arctic";
                break;
            case (2):
                terrain = "forest";
                break;
            case (3):
                terrain = "mountain";
                break;
        }
    }
    void DisplayTerrain() {
        System.out.println("You are in " + terrain + ".");
    }
    String getTerrain() {
        return terrain;
    }
}
