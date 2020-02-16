package Rate;

public class RateOfInterestChecker {
	double ROTC(double p,double t,double r,String Simpleinterest)
	{
		if(Simpleinterest.equals("SIMPLE INTEREST"))
		{
		   return ((p*t*r)/100);	
		}
		return 0;
	}

}
