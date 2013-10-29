package pse2.wk7.exc;

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
public class CircleTest {

    private Circle sameCircle;
    private final int firstRadius = 5;
    private final String firstColour = "Red";
   

    public CircleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Testing the class Circle");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        try {
            sameCircle = new Circle(firstRadius, firstColour, true);
        } catch (ShapeException e) {
            System.out.println("Set up failed - should not get here");
        }
    }

    @After
    public void tearDown() {
    }  

    @Test
    public void testGetWidth() {
        System.out.println("\ntestGetGetWidth");
        int expResult = firstRadius * 2;
        int result = sameCircle.getWidth();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHeight() {
        System.out.println("\ntestGetHeight");
        int expResult = firstRadius * 2;
        int result = sameCircle.getHeight();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetArea() {
        System.out.println("\ntestGetArea");
        double expResult = Math.PI * firstRadius * firstRadius;
        double result = sameCircle.getArea();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTypeOfShape() {
        System.out.println("\ntestGetTypeOfShape");
        String expResult = "Circle";
        String result = sameCircle.getTypeOfShape();
        assertEquals(expResult, result);
    }

    @Test
    public void testReset() throws ShapeException {
        System.out.println("\ntestReset");
        try {
            sameCircle.setRadius(8);
            sameCircle.reset();
            assertEquals(sameCircle.getHeight(), firstRadius * 2);
        } catch (ShapeException e) {
            fail("reset should not throw exception here");
        }
    }

    @Test
    public void testConstructRadiusOk() {
        System.out.println("\ntestConstructRadiusOk");
        try {
            Circle circle;
            circle = new Circle(1, "Red", true);
            assertEquals(circle.getHeight(), 2);
            assertEquals(circle.getWidth(), 2);
            assertEquals(circle.getArea(), Math.PI, 0.0);
        } catch (Exception e) {
            fail("Should not throw exception here");
        }
    }

    @Test
    public void testSetRadius_6() {
        System.out.println("\ntestSetRadius_6");
        try {
            sameCircle.setRadius(6);
            assertEquals(sameCircle.getHeight(), 12);
        } catch (ShapeException e) {
            fail("should not throw an exception here");
        }

    }

    @Test
    public void testSetRadius_1() {
        System.out.println("\ntestSetRadius_1");
        try {
            sameCircle.setRadius(1);
            assertEquals(sameCircle.getHeight(), 2);
        } catch (ShapeException e) {
            fail("should not throw an exception here");
        }

    }

    @Test
    public void testSetRadius_Zero() {
        System.out.println("\ntestSetRadius_Zero");
        try {
            sameCircle.setRadius(0);
            assertEquals(sameCircle.getHeight(), 0);

        } catch (ShapeException e) {
            fail("should not throw an exception here");
        }
    }

    @Test
    public void testSetRadius_Minus1() {
        System.out.println("\ntestSetRadius_Minus1");
        try {
            sameCircle.setRadius(-1);
            fail("should throw an exception here");
        } catch (ShapeException e) {
            System.out.println(e);
        }
    }

    @Test(expected=ShapeException.class)
    public void testSetRadius_Minus1_compact() throws ShapeException{
        System.out.println("\ntestSetRadius_Minus1_compact");
        sameCircle.setRadius(-1);
    }
}