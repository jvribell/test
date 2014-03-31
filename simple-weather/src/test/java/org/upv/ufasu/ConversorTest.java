package org.upv.ufasu;

import org.upv.ufasu.weather.TemperaturaConversor;

import junit.framework.TestCase;

public class ConversorTest extends TestCase {
	
	public void testParser()  throws Exception {
	
		String f,c;
	
		f="50";
		c= TemperaturaConversor.convertToCelsius(f);
		assertEquals(c,"10");
				
	}

}
