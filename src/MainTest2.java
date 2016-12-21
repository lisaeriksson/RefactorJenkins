import static org.junit.Assert.*;

/**
 * Created by lisaeriksson on 2016-12-21.
 */
public class MainTest2 {
    @org.junit.Test
    public void testKilreml() throws Exception {
        double actual = CalcFunc.kilreml(5, 5, 5);
        double expected = 25.7;
        assertEquals(expected, actual, 0.01);
        System.out.println("testKilteml");
    }

    @org.junit.Test
    public void testCcmatt() throws Exception {
        double actual = CalcFunc.ccmatt(5, 5, 5);
        double expected = -5.35;
        assertEquals(actual, expected, 0.001);
        System.out.println("testCcmatt");
    }

}