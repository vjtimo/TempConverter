import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @Test
    public void testKelvinToCel(){
        assertEquals(0.0, converter.kelvinToCel((float)273.15), 0.01);
    }
}
