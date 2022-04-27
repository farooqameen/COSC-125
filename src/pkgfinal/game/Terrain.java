/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.game;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Farooq Ameen
 */
public class Terrain {

    private final ArrayList<String> terrain = new ArrayList<>();
    
    Terrain() {
        terrain.add("desert");
        terrain.add("forest");
        terrain.add("arctic");
        terrain.add("mountain");
    }
    public String getTerrain() {
        Random rand = new Random();
        int random;
        random = rand.nextInt(4);
        return terrain.get(random);
    }
}
