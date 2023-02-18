package Lesson6;



public class Cat {
    String name;
    public String color;
    protected int weight;
    private String breed;
    private String clinic;
    private String expo;
    private String theatre;

    public Cat(String name, String color, int weight, String breed, String clinic, String expo, String theatre) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.breed = breed;
        this.clinic = clinic;
        this.expo = expo;
        this.theatre = theatre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getExpo() {
        return expo;
    }

    public void setExpo(String expo) {
        this.expo = expo;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    @Override
    public String toString() {
        return name + "  сказал Мяу!";
    }

    public static void toPat(){
        System.out.println("Муррррр");
    }
}