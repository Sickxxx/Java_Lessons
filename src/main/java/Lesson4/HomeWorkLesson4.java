package Lesson4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWorkLesson4 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();
            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            } else if (inputString.equals("print")) {
                if (wordsList.size() == 0) {
                    System.out.println("В списке нет элементов");
                } else {
                    for (int i = 0; i < wordsList.size(); i++) {
                        String wordFromList = wordsList.get(i);
                        System.out.printf("%2d) %s%n", i + 1, wordFromList);
                    }
                }
                continue;
            } else if (inputString.equals("revert")) {
                wordsList.remove(0);
            } else {
                wordsList.add(0, inputString);
            }
        }

    }
    private static void ex2() {
        LinkedList<String> numbersList = new LinkedList<>();
        Collections.addAll(numbersList, "1", "2", "3", "4", "5", "6","7","8","9","0");
        int size = numbersList.size()-1;
        for (int i = size; i >= 0; i--) {
            String numberFromList = numbersList.get(i);
            System.out.print(numberFromList + " ");
        }
    }
}


