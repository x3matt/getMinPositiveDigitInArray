import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    Controller controller;

    @Before
    public void init(){
        controller = new Controller();
    }

    @Test
    public void testGetMinPositiveDigitInArray_valid(){
        int[] array1 = {-1,-5,-7,1,6,-2,5,2,7,0};
        assertEquals(1,controller.getMinPositiveDigitInArray(array1));
        int[] array2 = {-7,10,-2,-8,-7,2,19,111};
        assertEquals(2,controller.getMinPositiveDigitInArray(array2));
        int[] array3 = {15,88,-150,-11,56,87,-2501};
        assertEquals(15,controller.getMinPositiveDigitInArray(array3));
        int[] array4 = {-6,4,7,-2,-66,-12,-54,54};
        assertEquals(4,controller.getMinPositiveDigitInArray(array4));
    }
}
