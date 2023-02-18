package Lesson6.HomeWork;

public class Notebook {
    private String name;
    private int diagonal;
    private double cpu;
    private int ram;
    private String gpu;
    private String color;

    public Notebook(String name, int diagonal, double cpu, int ram, String gpu, String color) {
        this.name = name;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.color = color;
    }


    public void notebookSelection() {
        System.out.println("Вы выбрали ноутбук марки: " + name + " Цвет: " + color);
    }

    public void printChars() {
        System.out.println("Характеристики: Видеокарта " + gpu + " ОЗУ: " + ram + " ГБ Процессор: " + cpu + " ГГЦ");
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(diagonal);
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(gpu);
        System.out.println(color);
    }

    public String getName() {
        return name;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public float getCpu() {
        return (float) cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
