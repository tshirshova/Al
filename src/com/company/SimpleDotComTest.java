package com.company;

public class SimpleDotComTest {
    private static SimpleDotCom dot = new SimpleDotCom();

    public static void main(String[] args) {
        before_tests();
        test_success();
        test_error();
        test_endgame();

    }

    private static void chek_result(String validresult, String realresult) {
        if (validresult.equals(realresult)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }

    }

    private static void before_tests() {

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
    }

    private static void test_success() {

        String userGuess = "2"; //Входные данные
        String result = dot.checkYourself(userGuess); //Вызов тестируемого метода

        chek_result("Попал", result);
//Тест

    }

    private static void test_error() {

        String userGuess = "13"; //Входные данные
        String result = dot.checkYourself(userGuess); //Вызов тестируемого метода

        chek_result("Мимо", result);
//Тест

    }

    private static void test_endgame() {
        dot.setNumOfHits(0);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess); //Вызов тестируемого метода

        userGuess = "3";
        result = dot.checkYourself(userGuess); //Вызов тестируемого метода

        userGuess = "4";
        result = dot.checkYourself(userGuess); //Вызов тестируемого метода

        chek_result("Конец игры", result);
    }
}
