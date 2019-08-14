package StatePattern;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public String display() {
        return null;
    }
}
