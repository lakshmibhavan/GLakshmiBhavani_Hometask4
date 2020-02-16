package Rate;

public class houseconstructioncost {
	double housecost(String materialType,double totalarea)
	{
		if(materialType.equals("Standard Materials"))
		{
			return (1200*totalarea);
		}
		else if(materialType.equals("Above Standard Materials"))
		{
			return (1500*totalarea);
		}
		else if(materialType.equals("High Standard Materials"))
		{
			return (1800*totalarea);
		}
		else if(materialType.equals("High Standard Materials and fully automated home"))
		{
			return (2500*totalarea);
		}
		return 0;
	}

}
