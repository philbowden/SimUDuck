package client;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(QuackBehavior duckBehavior, FlyBehavior flyBehavior) {
        super(duckBehavior, flyBehavior);
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
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
