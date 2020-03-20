package bridge;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        wolf.eat(mouse);
    }
}
