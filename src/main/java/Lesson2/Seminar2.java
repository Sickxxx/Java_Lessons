package Lesson2;

import java.util.Scanner;

public class Seminar2 {


    private static int userInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверый ввод! Введите число");
            }
        }
        return inputStr;
    }

    private static char charInput(String msg) {
        Scanner sc = new Scanner(System.in);
        char inputChar;
        while (true) {
            System.out.print(msg);
            try {
                inputChar = sc.next().charAt(0);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверый ввод! Введите число");
            }
        }
        return inputChar;
    }


    public static void main(String[] args) {
        ex2();
//        char a = charInput("Введите первый символ: ");
//        char b = charInput("Введите второй символ: ");
//        int strSize = userInput("Введите размер строки: ");
//
//        StringBuilder sb = new StringBuilder();
//        while (strSize > 0) {
//            sb.append(a);
//            strSize--;
//            if (strSize > 0) {
//                sb.append(b);
//                strSize--;
//            }
//        }
//        System.out.println(sb);
    }

    static void foo() {
        char firstChar = 'a';
        char secondChar = '_';
        int n = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(firstChar);
            } else {
                sb.append(secondChar);
            }
        }

        System.out.println(sb);
    }

    static void bar() {
        char firstChar = 'a';
        char secondChar = '_';
        String firstSymbolString = String.valueOf(firstChar);
        String secondSymbolString = secondChar + "";
        int n = 5;

        if (n == 1) {
            System.out.println(firstSymbolString);
            System.exit(0);
        }

        String strResult = firstSymbolString
                .concat(secondSymbolString)
                .repeat(n / 2)
                .concat((n % 2 == 1) ? firstSymbolString : "");

/*        if (n % 2 == 1) {
            strResult += firstSymbolString;
        }*/

        System.out.println(strResult);
    }

    static void ex2() {
        String text = "aaaadbbcd";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                counter++;
            } else {
                if (counter == 1) {
                    sb.append(text.charAt(i - 1));
                } else {
                    sb.append(text.charAt(i - 1)).append(counter);
                    counter = 1;
                }
            }
            if (i == text.length()-1){
                sb.append(text.charAt(i)).append(counter);
            }
        }

        System.out.println(sb);

    }
    private static void konstantin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для сжатия");
        String string1 = scan.next();
        StringBuilder builder = new StringBuilder();

        System.out.println();
        int counter = 1;
        char current = 0;
        char prev = 0;
        for (int i = 1; i < string1.length(); i++) {
            current = string1.charAt(i);
            prev = string1.charAt(i - 1);
            if (current != prev) {
                builder.append(prev).append((counter != 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        builder.append(current).append((counter != 1) ? counter : "");

        System.out.println(builder);

    }

    public static void concatMethod3() {
        String str = "aaaabbbbcccccccccccccccccdfghjdddddddeeetttgh";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char currChar = str.charAt(0);
        char nextChar = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            nextChar = str.charAt(i + 1);
            if (currChar != nextChar) {
                sb.append(currChar);

                if (counter > 1) {
                    sb.append(counter);
                }
                currChar = nextChar;
                counter = 0;
            }
            counter++;
        }
        sb.append(currChar);
        if (counter > 1) {
            sb.append(counter);
        }

        System.out.println(sb);
    }

}

