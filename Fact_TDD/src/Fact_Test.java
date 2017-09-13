import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Fact_Test {

	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}
	
	/*
	 * 1. when the number is zero system should return one
	 * 2. when the number is one system should return one
	 * 3. when the number is positive system should return expected output
	 *     4-24
	 * 4. when the number is negative system should throw exception
	 */
	
	@Test
	public void whenTheNumberIsZeroSystemShouldReturnOne()
	{
		assertEquals(1, m.getFact(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.getFact(-4);
	}
	
	

	
}
