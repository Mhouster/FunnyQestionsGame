package Cwiczenia.MyOwnGame;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FunnyQestionsService {
    Random random = new Random();
    private int lives = 3;

    public int LotteryNumber() {
        return random.nextInt(1000) % 2;
    }

    public void obverseReverseGame() {
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        if (userChoice > 2)
            throw new InputMismatchException("Nieprawdiłowa liczba, wybierz jeden lub 2");
        int number = LotteryNumber();
        int reverse = 1;
        int obverse = 0;
        if (userChoice == obverse) {
            if (number == obverse) {
                lives++;
                PrintInfo.whenLoosedLives();
            } else if (number == reverse) {
                PrintInfo.whenWinnedLives();
            } }
        if (userChoice == reverse) {
            if ( number == reverse) {
                lives++;
                PrintInfo.whenWinnedLives(); }
            else if (number == obverse)
                PrintInfo.whenLoosedLives(); }
    }

    public int getLives() {
        return lives;
    }
}

