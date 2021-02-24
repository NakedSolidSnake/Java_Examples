package entities;

import exceptions.DomainException;

public class Divider {
	public static double divide(double numerator, double denominator) throws DomainException{
		if(denominator == 0.0) {
			throw new DomainException("Divided by zero");
		}
		
		return numerator/denominator;
	}
}
