package Cwiczenia.MyOwnGame;

public class PrintInfo  {
    static final String userChoiceYes = "TAK";
    static final String userChoiceNo = "NIE";
    FunnyQestionsService fqs;
    public  void printInfoOnTheBegining() {
        System.out.println("Witam Cię serdecznie w mojej grze testowej v0.1 . Ta gra to po prostu quiz, ze śmiesznymi pytaniami.");
        System.out.println("Na początku Twoja gra rozpoczyna sie z 3 życiami. Po każdej złej odpowiedzi żyćie będzie odejmowane.");
        System.out.println("Dam Ci szanse rozpocząć tę grę z 4 życiami, jeśli chcesz napisz " + userChoiceYes +
                " albo " + userChoiceNo + " jeśli chcesz przejśc do pytań.");
    }
    public static void whenWinnedLives() {
        System.out.println("Udało się, wygrałeś/aś jedno życie więcej. Ich stan teraz to: "  );  // Tutaj chciałbym dodać getLives z klasy FunnyQuestions service
    }
    public static void whenLoosedLives() {
        System.out.println("Niestety, tym razem się nie udało , stan twoich żyć pozostaje niezmieniony i wynosi ");  // Tutaj chciałbym dodać getLives z klasy FunnyQuestions service
    }
}
