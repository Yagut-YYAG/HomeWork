package hw7;

public class Fish extends Pet {
    String name;
    String color;

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void eat(){
        System.out.println("Fish eats");
    }
    @Override
    public void respond(){
        System.out.println("Fish can respond");
    }

}
