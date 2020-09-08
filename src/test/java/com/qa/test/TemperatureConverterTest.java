package com.qa.test;

import com.qa.main.TemperatureConverter;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {
    static TemperatureConverter tempo;
    @BeforeClass
    public static void setup(){
        tempo= new TemperatureConverter();
    }
    @Test
    public void convertFahrenheitToCelsiusTest(){
        assertEquals("Expecting : 0.0",0.0,tempo.convertFahrenheitToCelsius(30),0.1);

    }
    @Test
    public void convertCelsiusToFahrenheitTest(){
        assertEquals("Expecting : 86",86.0,tempo.convertCelsiusToFahrenheit(30),0.1);
    }
    @Test
    public void convertKelvinToCelsiusTest(){
        assertEquals("Expecting : 0.0",0.0,tempo.convertKelvinToCelsius(30),0.1);
    }
    @Test
    public void convertCelsiusToKelvinTest(){
        assertEquals("Expecting : 0.0",0.0,tempo.convertCelsiusToKelvin(30),0.1);
    }
    @Test
    public void convertKelvinToFahrenheitTest(){
        assertEquals("Expecting : 0.0",0.0,tempo.convertKelvinToFahrenheit(30),0.1);
    }
    @Test
    public void convertFahrenheitToKelvinTest(){
        assertEquals("Expecting : 0.0",0.0,tempo.convertKelvinToFahrenheit(30),0.1);
    }
    @Test
    public void ClassTest(){
        Object obj = null;
        assertNull(obj);
    }

    @Test
    public void ClassTestTwo(){
        Object obj = tempo;
        assertNotNull(obj);
    }


}
