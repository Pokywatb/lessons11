package bridge;

public class Mouse implements CanBeEaten{


    @Override
    public void eaten(CanEat animal) {
        System.out.println("Съеден");
    }
}
