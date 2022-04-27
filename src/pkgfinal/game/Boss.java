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

    private String special;
    private int damage;

    Boss() {
        Random rand = new Random();
        int random;
        random = rand.nextInt(2);
        switch (random) {
            case (0):
                special = "Double Damage";
                damage = getEnemyHealth() * 2;
                break;
            case (1):
                special = "Double Health";
                damage = getEnemyHealth() / 2;
                break;
        }
    }

    public String getBossSpecial() {
        return special;
    }

    public int getBossDamage() {
        return damage;
    }

    public String getBossType() {
        String s = "Boss " + getEnemyType();
        return s;
    }

    public void displayBoss() {
        System.out.println("You have encountered a " + getEnemyType() + " with " + getBossSpecial() + "!");
        System.out.println("The have " + getBossDamage() + " damage!");
    }

}
