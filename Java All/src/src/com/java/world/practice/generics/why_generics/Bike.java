package src.com.java.world.practice.generics.why_generics;

class Bike {
    private final String name;
    private final String color;

    public Bike(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
