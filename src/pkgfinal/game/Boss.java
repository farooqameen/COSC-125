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
public class Boss extends Enemy {
    String special;
    int damage;
    Boss() {
        Random rand = new Random();
        int random;
        random = rand.nextInt(2);
        switch (random) {
            case (0):
                special = "Double Damage";
                damage = getEnemyHealth()*2;
                break;
            case (1):
                special = "Double Health";
                damage = getEnemyHealth()/2;
                break;

    }
    }
    String getBossSpecial() {
        return special;
    }
    int getBossDamage() {
        return damage;
    }
    void displayBoss() {
        System.out.println("You have encountered a " + getEnemyType() + " with " + getBossSpecial() + "!");
        System.out.println("The have " + getBossDamage() + " damage!");
    }
    
}
