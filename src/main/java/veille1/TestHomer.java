package veille1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHomer {
    @Test
    public void testDrinkBeer() {
        HomerSimpson homer = new HomerSimpson();
        String result = homer.drinkBeer();
        assertEquals("I love Duff!", result);
    }

    @Test
    public void testEat() {
        HomerSimpson homer = new HomerSimpson();
        String result = homer.eat();
        assertEquals("I love donuts!", result);
    }
}