package Lession3.Task2;

public abstract class Fruit {
    private String name;
    private Float weigth;

    public String getName() {
        return name;
    }

    public Float getWeigth() {
        return weigth;
    }

    public Fruit(String name, Float weigth) {
        this.name = name;
        this.weigth = weigth;
    }
    @Override
    public String toString() {
        return name + ", " + weigth;
    }
}
