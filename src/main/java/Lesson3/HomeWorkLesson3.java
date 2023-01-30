package Lesson3;

import java.util.*;

public class HomeWorkLesson3 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static List<Integer> arrayGenerator() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(20); i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    private static void task1() {
        //Пусть дан произвольный список целых чисел, удалить из него
        //четные числа (в языке уже есть что-то готовое для этого)
        List<Integer> numbers = arrayGenerator();
        System.out.println("Сгенерированный список");
        System.out.println(numbers);
        numbers.removeIf(i -> (i % 2 == 0));
        System.out.println("Список без четных чисел");
        System.out.println(numbers);
    }


    private static void task2() {
        //Задан целочисленный список ArrayList. Найти минимальное,
        //максимальное и среднее арифметическое из этого списка.
        List<Integer> numbers = arrayGenerator();
        System.out.println("Сгенерированный список");
        System.out.println(numbers);
        int min = numbers.get(0);
        int max = numbers.get(0);
        float sum = 0;
        for (Integer i : numbers) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
            sum += i;
        }
        float res = sum / numbers.size();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее Арифметическое: " + res);
    }

}
