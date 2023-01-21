package Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    private static void ex2() {
        int arr[] = {0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0};
        int counter = 0;
        int maxCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                    counter = 0;
                }
            }
        }
        System.out.println(maxCounter);


    }

    private static void ex1() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}