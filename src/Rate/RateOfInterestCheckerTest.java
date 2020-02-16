package Rate;

import static org.junit.Assert.*;

import org.junit.Test;

public class RateOfInterestCheckerTest {

	@Test
	public void testROTC() {
		RateOfInterestChecker r = new RateOfInterestChecker();
		assertEquals(4166.675,r.ROTC(100000,0.166667,25,"SIMPLE INTEREST"),0);
	}
	@Test
	public void testROTC1() {
		RateOfInterestChecker r = new RateOfInterestChecker();
		assertEquals(90.66576,r.ROTC(3400,0.33333,8,"SIMPLE INTEREST"),0);
	}

}
