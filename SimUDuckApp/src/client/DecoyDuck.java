package client;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class DecoyDuck extends Duck {
    public DecoyDuck(QuackBehavior duckBehavior, FlyBehavior flyBehavior) {
        super(duckBehavior, flyBehavior);
    }
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
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
