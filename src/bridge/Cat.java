package bridge;

public class Cat implements CanBeEaten, CanEat {


    @Override
    public void eaten(CanEat animal) {
        System.out.println("Съеден");

    }

    @Override
    public void eat(CanBeEaten animal) {
        System.out.println("Съел");

    }
}
