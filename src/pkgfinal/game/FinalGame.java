/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.game;
import java.util.Scanner;
/**
 *
 * @author Farooq Ameen
 */
public class FinalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Settings game1 = new Settings();
//        game1.setVolume(20);
//        game1.displayVolume();
//        game1.setVolume(50);
//        game1.displayVolume();
//        Character Bozo = new Character();
//        Bozo.displayStats();
        
        System.out.println("Welcome to Grimm's Journey!");
        
        int choice;
        
        choice = DisplayMenu();
        Settings game1 = new Settings();
        game1.setVolume(20);
        game1.displayVolume();
        game1.setVolume(50);
        game1.displayVolume();
        
    }
    public static int DisplayMenu() {
        int n=0;
        boolean flag=false;
        System.out.println("1. New Game\n2. Save Game\n3. Delete Save\n4. Settings\n5. Exit");

        Scanner userInput = new Scanner(System.in);

        do {
//            System.out.println("Flag: " + flag);
            System.out.print("Please enter 1-5: ");
            n=userInput.nextInt();
            System.out.println();
            if (n>=1 && n<=4) {
                flag = true;
            }
            else if (n==5) {
                flag = true;
                System.out.println("Thank you. Goodbye.");
            }
            else {
                flag=false;
                System.out.println("Invalid choice.");
                System.out.println("End of stack.\n");
            }
//            System.out.println("Flag: " + flag);
        } while (flag==false);
        return n;
    }
    
    
    
    public static class Character {
        private int health;
        private int mana;
        private double damageModif;
        private String type;
        private static int numberOfCharacters=0;
        
        Character() {
            type=null;
            health=0;
            mana=0;
            damageModif=0;
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
                    damageModif=0.4;
                    break;
                case "ninja":
                    health = 30;
                    mana=35;
                    damageModif=0.75;
                    break;
            }   
        }
        void displayStats(){
            System.out.println("Character type: " + type);
            System.out.println("Health: " + health);
            System.out.println("Mana: " + mana);
            System.out.println("Damage modifier: " + damageModif);
            System.out.println("Number of characters created: " + numberOfCharacters);
        }
    }
    
    public static class Settings {
        int volume;
        int fieldOfView;
        String textureQuality;
        String effectIntensity;
        String ambientOcclusion;
        
        void displayAll() {
            System.out.println("The current settings are: ");
            displayVolume();
            System.out.println("Field of view: " + fieldOfView);
            System.out.println("Texture quality: " + textureQuality);
            System.out.println("Effect intensity: " + effectIntensity);
            System.out.println("Ambient occlusion: " + ambientOcclusion);
        }
        
        void displayVolume() {
            System.out.print("Volume: ");
            for (int i = 0; i<volume; i++) {
                System.out.print("|");
            }
            for (int i = 0; i<(100-volume); i++) {
                System.out.print(".");
            }
            System.out.println();
        }
        
        void setVolume(int n) {
            if (n>=0 && n<=100) {
                volume = n;
            }
            else {
                System.out.println("Invalid volume.");
            }
        }
        
        void setTextureQuality (String s) {
            s.toUpperCase();
            switch (s) {
                case ("L"):
                    textureQuality = "Low";
                    break;
                case ("M"):
                    textureQuality = "Medium";
                    break;
                case ("H"):
                    textureQuality = "High";
                    break;
                default:
                    System.out.println("Invalid texture quality.");
                    return;
                    
            }
            System.out.println("The texture quality is now: " + textureQuality);
        }
        void setEffectIntenisty (String s) {
            s.toUpperCase();
            switch (s) {
                case ("L"):
                    effectIntensity = "Low";
                    break;
                case ("M"):
                    effectIntensity = "Medium";
                    break;
                case ("H"):
                    effectIntensity = "High";
                    break;
                default:
                    System.out.println("Invalid effect.");
                    return;
                    
            }
            System.out.println("The effect intensity is now: " + effectIntensity);
        }
        void setAmbientOcclusion (String s) {
            s.toUpperCase();
            switch (s) {
                case ("E"):
                    ambientOcclusion = "Enabled";
                    break;
                case ("D"):
                    ambientOcclusion = "Disabled";
                    break;
                default:
                    System.out.println("Invalid ambient occlusion");
                    return;
                    
            }
            System.out.println("The ambient occlusion is now: " + effectIntensity);
        }
        void setFieldOfView(int n) {
            if (n>=60 && n<=1110) {
                fieldOfView = n;
            }
            else {
                System.out.println("Invalid field of view.");
            }
        }
    }
    
}
