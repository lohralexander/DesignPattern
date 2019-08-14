package StatePattern;

public class NoQuack implements QuackBehavior {
    public String quack() {
        return "Silence";
    }
}
