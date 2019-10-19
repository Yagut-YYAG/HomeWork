package hw7;

public class DomesticCat extends Pet implements Foul {
    @Override
    public void eat(){
        System.out.println("DomesticCat eats");
    }
    @Override
    public void respond(){
        System.out.println("DomesticCat eats");
    }
}
