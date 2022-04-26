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
public class Enemy {
    private int health;
    private String type;
    private static int numberOfEnemies;
    Enemy() {
        Random rand = new Random();
        int random;
        random = rand.nextInt(2);
        switch (random) {
            case (0):
                type = "Creepy Crawler";
                health = 25;
                break;
            case (1):
                type = "Winged Rat";
                health = 35;
                break;
        }
    }
    public String getEnemyType() {
        return type;
    }
    public int getEnemyHealth() {
        return health;
    }
}
