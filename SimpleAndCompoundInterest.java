package EpamAss1.CleanCode;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	
	public double calculateSimpleInterest(double principle, double rateOfInterest, double time) {
		// TODO Auto-generated method stub
		//formula to find simple interest is simpleInterest = (principle * time * rateOfInterest)/100
		return (principle * time * rateOfInterest)/100;
	}

	public double calculateCompoundInterest(double principle, double rateOfInterest, double time) {
		// TODO Auto-generated method stub
		//formula to find compoundInterest is compoundInterest = (principle * Math.pow(1.0+rateOfInterest/100.0,time) - principle)
		return (principle * Math.pow(1.0+rateOfInterest/100.0,time) - principle);
	}

}
