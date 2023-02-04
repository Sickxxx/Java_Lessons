package Lesson4;

import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.stream.Collectors;

public class Seminar4 {
    public static void main(String[] args) {
//        foo();
//        ex0();
        ex1();
    }

    private static void ex0() {
        final int SIZE = 1_000_000;
        Random random = new Random();

        ArrayList<Random> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(new Random());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));


        LinkedList<Random> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(new Random());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        int num = 0;


        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equals("print~all")) {
                for (int i = 0; i < wordsList.size(); i++) {
                    String wordFromList = wordsList.get(i);
                    if (wordFromList == null) {
                        System.out.printf("%2d) -%n", i + 1);
                    } else {
                        System.out.printf("%2d) %s%n", i + 1, wordFromList);
                    }
                }
                continue;
            }
            if (!inputString.contains("~")) {
                System.out.println("Строка не содержит тильду");
                continue;
            }

            String[] parts = inputString.split("\\~");
            String word = parts[0];
            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }

            if (word.equals("print")) {
                String wordFromList = wordsList.get(num - 1);
                if (wordFromList == null || num < 0 || num > wordsList.size() + 1) {
                    System.out.printf("По текущему индексу %d не найдено значений%n", num);
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n", num, wordFromList);
                }
            } else if (num >= wordsList.size() + 1) {
                for (int i = wordsList.size(); i < num - 1; i++) {
                    wordsList.add(null);
                }
                wordsList.add(word);
                System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num - 1, word);
                if (oldWord == null) {
                    System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
                } else {
                    System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
                }
            }
        }

    }


    private static void foo() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

        long count = linkedList.stream().filter((n) -> n % 2 == 0).count();

        System.out.println(count);

        List<String> strings = linkedList.stream().skip(3).map(n -> "Число: " + n).toList();

//        Optional<String> optionalInteger = Optional.of(null).orElseGet(() -> "String");

        String s = null;
//        s = s.toUpperCase();

        System.out.println("Hello!".compareTo("World"));

//        linkedListCats.get(i).getWork().getTitle();
//        linkedListDogs.get(i).getWork().getTitle();

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);


        System.out.println(linkedList);
        System.out.println(strings);
    }
}
