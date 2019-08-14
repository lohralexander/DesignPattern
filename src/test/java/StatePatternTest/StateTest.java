package StatePatternTest;

import StatePattern.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {

    @Test
    void testIfDisplayWorks(){
        //Arrange
        Duck normalDuck = new NormalDuck();

        //Assert
        assertEquals("It's a Duck", normalDuck.display());
    }

    @Test
    void testIfMethodQuackWorks(){
        //Arrange
        Duck normalDuck = new NormalDuck();

        //Assert
        assertEquals("Quack", normalDuck.performQuack());
    }

    @Test
    void testifMethodFlyingWorks(){
        Duck normalDuck = new NormalDuck();

        assertEquals("I'm flying", normalDuck.performFly());
    }

    @Test
    void testMallardDuckMethodFly(){
        Duck mallardDuck = new MallardDuck();

        assertEquals("On the Ground", mallardDuck.performFly());
    }

    @Test
    void testMallardDuckMethodQuack(){
        Duck mallardDuck = new MallardDuck();

        assertEquals("Quack", mallardDuck.performQuack());
    }

    @Test
    void testRocketDuck(){
        Duck modelDuck = new ModelDuck();

        assertEquals("On the Ground", modelDuck.performFly());

        modelDuck.setFlyBehavior(new FlyRocket());
        assertEquals("Rocket Power!", modelDuck.performFly());




    }
}

