package client;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(QuackBehavior duckBehavior, FlyBehavior flyBehavior) {
        super(duckBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
    @Override
    public void performFly() {
        flyBehavior.fly();
    }
    @Override
    public void performQuack() {
        quackBehavior.quack();
    }
}
