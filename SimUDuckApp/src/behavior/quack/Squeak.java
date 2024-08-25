package behavior.quack;

import behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeakity squeak squeak squeak!");
    }
}
