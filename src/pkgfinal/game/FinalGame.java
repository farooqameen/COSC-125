/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.game;

import java.util.*;

/**
 *
 * @author Farooq Ameen
 */
public class FinalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Welcome to Grimm's Journey!");

        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            try {
                choice = DisplayMenu();
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, exiting program.");
            }
            Settings settings1 = new Settings();

            switch (choice) {
                case (2):
                    settings1.displayAll();
                    System.out.println("\nWould you like to change any settings? (y/n)");

                    char changesetting = input.next().charAt(0);
                    if (changesetting == 'y') {
                        ChangeSettings(settings1);
                    } else {

                        System.out.println();
                    }
            }
        } while (choice > 1);
    }

    public static int DisplayMenu() {
        int n = 0;
        boolean flag = false;
        System.out.println("1. New Game\n2. Settings\n3. Exit");

        Scanner userInput = new Scanner(System.in);

        do {
//            System.out.println("Flag: " + flag);
            System.out.print("Please enter 1-3: ");
            n = userInput.nextInt();
            System.out.println();
            if (n >= 1 && n <= 2) {
                flag = true;
            } else if (n == 3) {
                flag = true;
                System.out.println("Thank you. Goodbye.");
                System.exit(0);
            } else {
                flag = false;
                System.out.println("Invalid choice.");
//                System.out.println("End of stack.\n");
            }
//            System.out.println("Flag: " + flag);
        } while (flag == false);
        return n;
    }

    public static void ChangeSettings(Settings settings1) throws InputMismatchException {
        int n = 0;
        boolean flag = false;

        Scanner userInput = new Scanner(System.in);

        String s;
        char c;
        try {
            do {
                System.out.println("Which setting would you like to change?\nEnter 1-5:");
                n = userInput.nextInt();
                System.out.println();
                switch (n) {
                    case (1):
                        System.out.print("Enter new volume from 1-100: ");
                        n = userInput.nextInt();
                        if (n >= 0 && n <= 100) {
                            settings1.setVolume(n);
                        } else {
                            System.out.println("Invalid volume, value not changed.");
                        }
                        break;
                    case (2):
                        System.out.print("Enter new field of view from 60-110: ");
                        n = userInput.nextInt();
                        if (n >= 60 && n <= 110) {
                            settings1.setFieldOfView(n);
                        } else {
                            System.out.println("Invalid field of view, value not changed.");
                        }
                        break;
                    case (3):
                        System.out.println("Enter the new value (l/m/h): ");
                        c = userInput.next().charAt(0);
                        s = String.valueOf(c);
                        settings1.setTextureQuality(s);
                        break;
                    case (4):
                        System.out.println("Enter the new value (l/m/h): ");
                        c = userInput.next().charAt(0);
                        s = String.valueOf(c);
                        settings1.setEffectIntensity(s);
                        break;
                    case (5):
                        System.out.println("Enter the new value (e/d): ");
                        c = userInput.next().charAt(0);
                        s = String.valueOf(c);
                        settings1.setEffectIntensity(s);
                        break;

                }
                System.out.println("Would you like to change any other settings? (y/n)");
                char changesetting = userInput.next().charAt(0);
                if (changesetting == 'y') {
                    flag = false;
                } else {
                    flag = true;
                    System.out.println();
                    settings1.displayAll();
                    System.out.println();
                }

            } while (flag == false);
        } catch (InputMismatchException e) {
            System.out.println("An error occured. Goodbye.");
        }
    }
}
