package Lesson6.HomeWork;

import Lesson6.HomeWork.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("HP", 15, 4.0, 16, "Geforce Rtx 3080", "black");
        Notebook notebook2 = new Notebook("Samsung", 16, 3.5, 32, "Radeon 5300", "silver");
        Notebook notebook3 = new Notebook("Apple", 15, 3.7, 16, "Geforce Rtx 2070", "white");
        Notebook notebook4 = new Notebook("Lenovo", 17, 3.5, 8, "Radeon RX 590", "silver");
        Notebook notebook5 = new Notebook("HP", 17, 4.2, 16, "Geforce Rtx 1060", "black");
        Notebook notebook6 = new Notebook("Samsung", 16, 3.8, 8, "Radeon 6600", "silver");
        Notebook notebook7 = new Notebook("HP", 15, 3.9, 32, "Geforce Rtx 1050", "white");
        Notebook notebook8 = new Notebook("Lenovo", 17, 3.5, 16, "Radeon RX 570", "black");
        Notebook notebook9 = new Notebook("Samsung", 15, 4.1, 16, "Geforce Rtx 4090", "black");
        Notebook notebook10 = new Notebook("Apple", 16, 3.7, 8, "Radeon 7900", "silver");

        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);
//        for (Notebook notebook : notebooks) {
//            notebook.printChars();
//        }
        chooseNotebook(notebooks);

    }

    private static void chooseNotebook(ArrayList<Notebook> notebooks) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цвет выбираемого ноутбука(black,white,silver): ");
        String color = in.nextLine();
        System.out.print("Введите марку выбираемого ноутбука(Lenovo,HP,Apple,Samsung): ");
        String name = in.nextLine();
        int count = 0;
        for (Notebook notebook : notebooks) {
            if ((notebook.getColor().equals(color)) && (notebook.getName().equals(name))) {
                notebook.notebookSelection();
                notebook.printChars();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Ноутбука с выбранными параметрами нет в списке");
        } else {
            System.out.println("По вашему запросу найдено " + count + " ноутбуков");
        }

    }
}
