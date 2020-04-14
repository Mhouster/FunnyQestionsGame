package Cwiczenia.MyOwnGame;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Cwiczenia.MyOwnGame.PrintInfo.*;

public class FunnyQeustions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintInfo printInfo = new PrintInfo();
        FunnyQestionsService fqs = new FunnyQestionsService();
        String gameChoice = " ";
        printInfo.printInfoOnTheBegining();
        try {
            gameChoice = sc.nextLine();
            System.out.println("Twoja szansa na zdobycie większej ilości żyć to odgadnąć rezultat rzutu monetą.");
        } catch (InputMismatchException e) {
            e.getMessage();
        }
        if ((gameChoice.toUpperCase()).equals(userChoiceYes)) {
                System.out.println("Rzucamy monetą :");
                System.out.println("0 to reszka");
                System.out.println("1 to orzeł");
                fqs.obverseReverseGame(); }
            else if ((gameChoice.toUpperCase()).equals(userChoiceNo))
                System.out.println("W takim razie przechodzimy do quizu.");
    }
}

