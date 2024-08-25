package client;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(QuackBehavior duckBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = duckBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void display(){}
    public void performFly(){}
    public void performQuack(){}
}
