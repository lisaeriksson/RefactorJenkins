import static org.junit.Assert.*;

public class MainTest {
    @org.junit.Before
    public void printMessage(){
        System.out.println("Före");
    }

    @org.junit.Test
    public void testKuggdelningsdia() throws Exception {
        double actual = CalcFunc.kuggdelningsdia(5, 5);
        double expected = 25;
        assertEquals(expected, actual, 0.1);
        System.out.println("testKuggdelningsdia");
    }

    @org.junit.Test
    public void testKuggremshjul() throws Exception {
        double actual = CalcFunc.kuggremshjul(5, 5);
        double expected = 7.957;
        assertEquals(expected, actual, 0.01);
        System.out.println("testKugghjulsremhjul");
    }

    @org.junit.Test
    public void testKuggmodul() throws Exception {
        double actual = CalcFunc.kuggmodul(5);
        double expected = 1.591;
        assertEquals(expected, actual, 0.001);
        System.out.println("testKuggmodul");
    }

    @org.junit.After
    public void printAfter(){
        System.out.println("Efter");
    }

}