package hw7;

public class Dog extends Pet implements Foul {
    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void eat(){
        System.out.println("Dog eats");
    }
    @Override
    public void respond(){
        System.out.println("Dog can respond quickly");
    }
}
