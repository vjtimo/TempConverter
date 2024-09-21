import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = {2, 3, 5, 7};
        int[] a2 = {2, 3, 5, 7};
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 7}, {11, 13}};
        assertArrayEquals("Should be equal", a11, a12);
    }

    @Test
    public void testKelvinToCel(){
        assertEquals(0.0, converter.kelvinToCel((float)273.15), 0.01);
    }
}
