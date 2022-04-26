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
                System.out.println("An error occured. Goodbye.");
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
        } while (choice != 1);

        NewGame();
    }

    public static int DisplayMenu() {
        int n = 0;
        boolean flag = false;
        System.out.println("1. New Game\n2. Settings\n3. Exit");

        Scanner userInput = new Scanner(System.in);

        do {
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
            }
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
    public static void NewGame() {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        String charactertype;
        
        do {
        System.out.println("Type in your character type (case-sensitive): ");
        System.out.println("1. Warrior\n2. Mage\n3. Ninja");
        
        charactertype = input.nextLine();
        
        if (charactertype.equals("Warrior")) {
            System.out.println("A warrior is born...");
            flag = true;
        }
        else if (charactertype.equals("Mage")) {
            System.out.println("A mage, long forgotten, has risen...");
            flag = true;
        }
        else if (charactertype.equals("Ninja")) {
            System.out.println("Born in the shadows...");
            flag = true;
        }
        else {
            System.out.println("Incorrect character type. Try again.\n");
            flag = false;
        }
        } while (flag == false);
        
        Character character1 = new Character();
        character1.setType(charactertype);

        System.out.println("Your character has been created!");
        System.out.println("\nLoading...\n");
        
        System.out.println("Your character's stats are: ");
        character1.displayStats();
        
        System.out.println("\nGenerating terrain...");
        Terrain terrain1 = new Terrain();
        
        System.out.println("You are in a(n) " + terrain1.getTerrain() + " biome.");
        
        System.out.println("\nCreating enemies...");
        
        Stack battlestck = new Stack();
        Boss boss1 = new Boss();
        Enemy enemy1 = new Enemy();
        
        battlestck.push(boss1.getBossType());
        battlestck.push(enemy1.getEnemyType());
        
        
        System.out.println("\nEnemies: "); 
        for (int i=0;i<2;i++) {
            System.out.println(battlestck.pop());
        }
        
        System.out.println("\nBoss special: " + boss1.getBossSpecial());
        
        System.out.println("\nLoading questions...");
        
        LinkedList question = new LinkedList<>();
        question = ListOfQuestions();
        
        LinkedList answer = new LinkedList<>();
        answer = ListOfAnswers();
        
        String userAns;
        int points=0;
        try {
        do {
            System.out.println("Points = " + points);
            System.out.println(question.getFirst());
            System.out.println("Your answer: ");
            userAns = input.nextLine();
            if (answer.getFirst().equals(userAns) && points<1) {
                points++;
                System.out.println("\nEnemy defeated!");
                question.removeFirst();
                answer.removeFirst();
            }
            else if (answer.getFirst().equals(userAns) && points>=1) {
                points++;
                points++;
                question.removeFirst();
                answer.removeFirst();
                System.out.println("\nBoss defeated!");
                System.out.println("Well done!");
            }
            else {
                question.removeFirst();
                System.out.println("Incorrect. The answer was " + answer.removeFirst() + ".");
                System.out.println("\nNext question...");
            }
        } while (points<=3);
        }
        catch (NoSuchElementException e) {
            System.out.println("\nNo more questions.\nGoodbye.");
        }
    }
    public static LinkedList ListOfQuestions() {
        LinkedList<String> q = new LinkedList();
        q.addFirst("What is the capital of France?");
        q.addFirst("How many strings does a bass have?");
        q.addFirst("How many oceans are there?");
        q.addFirst("What is the largest land mammal?");
        q.addFirst("How many keys are on a piano?");
        return q;
    }
    public static LinkedList ListOfAnswers() {
        LinkedList<String> a = new LinkedList();
        a.addFirst("Paris");
        a.addFirst("4");
        a.addFirst("5");
        a.addFirst("elephant");
        a.addFirst("88");
        return a;
    }
}
