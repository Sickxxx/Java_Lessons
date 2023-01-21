package Lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson1 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    private static void Task1() {
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(arr));
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            } else {
                if (j < minValue) {
                    minValue = j;
                }
            }

        }
        System.out.printf("Максимальное число %s, минимальное число %s", maxValue, minValue);
    }

    private static void Task2() {
        //Написать метод, который определяет, является ли введенный пользователем год високосным,
        // и возвращает в консоль boolean (високосный - true, не високосный - false).
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("Введите год");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean flag = true;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(flag);
        } else {
            System.out.println(!flag);
        }
    }

    private static void Task3() {
        //Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2, 4);
        }
        System.out.println(Arrays.toString(arr));
        int val = 3;
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            while(arr[right] == val){
                right--;
            }
            if(arr[left]==val && left<right){
                int tmp = arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
                right--;
            }
            left++;
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));
    }
}
