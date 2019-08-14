package StatePattern;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new NoQuack();
    }

    public String display() {
        return null;
    }
}
