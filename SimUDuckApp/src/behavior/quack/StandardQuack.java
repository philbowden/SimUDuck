package behavior.quack;

import behavior.QuackBehavior;

public class StandardQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quackity quack quack!");
    }
}
