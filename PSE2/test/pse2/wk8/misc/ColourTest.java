//Week 8 ColourTest
package pse2.wk8.misc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter Rosner
 */
public class ColourTest {

    public ColourTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSwitch(){
        System.out.println("testSwitch");
        Colour colour = Colour.RED;
        switch(colour){
            case RED:
                System.out.println("Ok RED case, should get here");
                break;
            case BLUE:
                fail("BLUE case, shouldn't get here");
                break;
            default:
                fail("default case, shouldn't get here");
                break;
        }
    }

    @Test
    public void testEquality(){
        System.out.println("testEquality");
        Colour colour = Colour.RED;
        if (colour == Colour.RED){
            System.out.println("Test for == Colour.RED, should get here");
        }

        if (colour.equals(Colour.RED)){
            System.out.println("Test for .equals(Colour.RED), should get here");
        }

        if (colour.equals(Colour.GREEN)){
            fail ("Test for .equals(Colour.GREEN), shouldn't get here");
        }
    }

    

}