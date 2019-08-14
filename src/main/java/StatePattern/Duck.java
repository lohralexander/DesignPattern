package StatePattern;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){

    }

    public String performQuack() {
       return quackBehavior.quack();
    }

    public String performFly(){
        return flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public abstract String display();

}
