package hw7;

public class OOPapp {
    public static void main(String[] args) {

        Man m = new Man();
            // true
        if (m instanceof Man) {
            //true
        }
        if (m instanceof Human) {
            // true
        }
        Woman w = new Woman();
        if (w instanceof Woman) {
            // true
        }
        if (w instanceof Human) {
            // true
        }
        Species dog ;
        Dog d= new Dog("husky","white");
        d.eat();
        d.respond();
        Fish f=new Fish("goldfish","golden");
        f.eat();
        f.respond();
    }
}
