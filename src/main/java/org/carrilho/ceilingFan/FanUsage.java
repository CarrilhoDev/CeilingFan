package org.carrilho.ceilingFan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FanUsage {

    static Scanner sc = new Scanner(System.in);
    static int chordChoice;
    static String continueChoice = "yes";
    Chords chords = new Chords();

    public FanUsage() {
        chooseChord();
    }

    public void chooseChord() {
        do {
            try {
                System.out.println("Which chord do want to pull: ");
                System.out.println("Velocity Chord - press 1");
                System.out.println("Reserve Direction Chord - press 2");
                chordChoice = sc.nextInt();

                switch (chordChoice) {
                    case 1:
                        chords.pullIncreasingVelocityChord();
                        wantToContinue();
                        break;
                    case 2:
                        chords.pullReversingDirectionChord();
                        wantToContinue();
                        break;
                }
            } catch (InputMismatchException | IllegalStateException | NumberFormatException e) {
                e.getMessage();
                System.out.println("You need to choose 1 or 2");
                wantToContinue();
            }
        } while (continueChoice.equals("yes"));
    }

    public void wantToContinue() {
        System.out.println("Do you want to continue? \n(y - yes | anything else - no)");

            sc.nextLine();
            continueChoice = sc.nextLine();
            if (continueChoice.equals("y")) {
                chooseChord();
            }else{
                System.out.println("Ok! Bye!");
            }
    }
}
