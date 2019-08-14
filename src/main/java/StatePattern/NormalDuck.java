package StatePattern;

public class NormalDuck extends Duck {

    public NormalDuck(){
        flyBehavior = new Fly();
        quackBehavior = new Quack();

    }

    public String display() {
        return "It's a Duck";
    }
}
