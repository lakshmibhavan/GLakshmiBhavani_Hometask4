package Rate;

public class CompoundInterest {
	double COIAnnual(double p,double t,double r,double n)
	{
		   return  (p * Math.pow(1 + (r / n), n * t))-p;
	}
	
}
            