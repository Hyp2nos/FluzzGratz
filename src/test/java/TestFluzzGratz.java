import org.junit.Assert;
import org.junit.Test;

public class TestFluzzGratz {

    FluzzGratz fluzzGratz = new FluzzGratz();


    @Test
    public void testWithOther(){
        Assert.assertEquals("4",fluzzGratz.check(4));
    }

    @Test
    public void testWithThree(){
        Assert.assertEquals("Fluzz",fluzzGratz.check(3));
    }

    @Test
    public void testWithFive(){
        Assert.assertEquals("Gratz",fluzzGratz.check(25));
    }

    @Test
    public void testWithThreeAndFive(){
        Assert.assertEquals("FluzzGratz",fluzzGratz.check(15));
    }
}
