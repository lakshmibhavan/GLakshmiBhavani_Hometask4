package Rate;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HousecconstrutionTesting {
	private String materialType;
	private double totalarea;
	private double houseccost;
	private houseconstructioncost hcc;
	@Before
	public void init()
	{
		hcc = new houseconstructioncost();
	}
	 public HousecconstrutionTesting(String materialType, double totalarea,double houseccost) {
	      this.materialType = materialType;
	      this.totalarea = totalarea;
	      this.houseccost = houseccost;
	   }
	 @SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	   public static Collection House() {
	      return Arrays.asList(new Object[][] {
	         { "Standard Materials", 165.0,198000.0},
	         { "Above Standard Materials", 195.0,292500.0},
	         { "High Standard Materials", 65.0,117000.0 },
	         { "High Standard Materials and fully automated home", 220.0,550000.0},
	      });
	   }
	@Test
	public void test() {
		System.out.println("MaterialType is : " + materialType);
		System.out.println("Total Area is : " + totalarea);
	      assertEquals(houseccost, 
	      hcc.housecost(materialType,totalarea),0);
	}

}
