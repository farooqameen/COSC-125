/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.game;

/**
 *
 * @author Farooq Ameen
 */
public class Character {

    private int health;
    private int mana;
    private double damageModif;
    private String type;
    private static int numberOfCharacters = 0;

    Character() {
        type = null;
        health = 0;
        mana = 0;
        damageModif = 0;
        numberOfCharacters++;
    }

    void setType(String s) {
        type = s.toLowerCase();
        switch (type) {
            case "warrior":
                health = 75;
                mana = 25;
                damageModif = 0.5;
                break;
            case "mage":
                health = 40;
                mana = 60;
                damageModif = 0.4;
                break;
            case "ninja":
                health = 30;
                mana = 35;
                damageModif = 0.75;
                break;
        }
    }

    void displayStats() {
        System.out.println("Character type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Damage modifier: " + damageModif);
        System.out.println("Number of characters created: " + numberOfCharacters);
    }
}
