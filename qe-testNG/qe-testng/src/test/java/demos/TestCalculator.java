package demos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class TestCalculator {
    private Calculator claculator;

    @BeforeClass
    public void setUp(){
        claculator = new Calculator();
    }

    @Test
    public void test1(){
        Assert.assertEquals(claculator.sum(),3);
    }
}
