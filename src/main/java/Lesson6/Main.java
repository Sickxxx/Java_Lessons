package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat Marsik = new Cat("Marsik", "Grey", 3, "wild", "Aibolit", "NaN", "NaN");
        Cat Vasik = new Cat("Vasik", "Yellow", 3, "Sphinx", "4Lapy", "VVKKH", "NaN");
        System.out.println(Marsik);
        System.out.println(Vasik);
        System.out.println("Васик весит " + Vasik.getWeight() + " кило");
        Cat.toPat();
        Marsik.setExpo("Всемирная выставка котов");
        System.out.println("Марсик принял участие в " + Marsik.getExpo());

    }
}
