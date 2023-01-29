package Lesson2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        task1();
        task2();
    }


    private static void task1() {
        //1. Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст на проверку палиндрома: ");
        String text = scan.nextLine();
        boolean flag = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(i + text.length() / 2)) {
                flag = !flag;
            }
        }
        System.out.println(flag);
    }

    private static StringBuilder testWriter() {
        //2. Напишите метод, который составит строку, состоящую из 100
        // повторений слова TEST и метод, который запишет эту строку
        // в простой текстовый файл, обработайте исключения.
        String text = "TEST";
        StringBuilder sb = new StringBuilder();
        int length = 100;
        for (int i = 0; i <= length; i++) {
            sb.append(text);
        }
        return sb;
    }

    public static void task2() {

        try (FileWriter writer = new FileWriter("test.txt", false)) {

            String text = testWriter().toString();
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
