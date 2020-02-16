package Rate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CITest {
	CompoundInterest c;
	@Before
	public void init()
	{
		c = new CompoundInterest();
	}
	@Test
	public void test() {
		assertEquals(979.6914166032102,c.COIAnnual(2000,5,.08,12),0);
	}

}
