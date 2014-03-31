package org.upv.ufasu.weather;

public class TemperaturaConversor {

	public  static String convertToCelsius(String strf) {
		
		int f=Integer.valueOf(strf);
		int c=(int) Math.rint((f-32)/1.8);
				
		return String.valueOf(c);
	}
}
