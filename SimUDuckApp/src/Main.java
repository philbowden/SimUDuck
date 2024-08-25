import behavior.FlyBehavior;
import behavior.QuackBehavior;
import behavior.fly.FlyNoWay;
import behavior.fly.FlyWithWings;
import behavior.quack.MuteQuack;
import behavior.quack.Squeak;
import behavior.quack.StandardQuack;
import client.DecoyDuck;
import client.Duck;
import client.MallardDuck;
import client.RubberDuck;

public class Main {
    public static void main(String[] args) {
        FlyBehavior flyWithWings = new FlyWithWings();
        FlyBehavior flyNoWay = new FlyNoWay();
        QuackBehavior standardQuack = new StandardQuack();
        QuackBehavior squeak = new Squeak();
        QuackBehavior mute = new MuteQuack();
        Duck mallard = new MallardDuck(standardQuack, flyWithWings);
        Duck rubberDucky = new RubberDuck(squeak, flyNoWay);
        Duck decoy = new DecoyDuck(mute, flyNoWay);
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        rubberDucky.display();
        rubberDucky.performQuack();
        rubberDucky.performFly();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        System.out.println("setting decoy's quack behavior");
        decoy.setQuackBehavior(standardQuack);
        decoy.performQuack();
    }
}