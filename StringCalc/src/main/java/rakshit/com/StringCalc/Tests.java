package rakshit.com.StringCalc;

import org.junit.Test;
import org.junit.Assert;

public class Tests {
	Calculator c=new Calculator();
	@Test
	public void EmptyStringTest(){
	    int n=c.add("");
		Assert.assertEquals(0,n);
	}
	@Test
	public void StringWithOneNumberTest()  {
	    int n=c.add("100");
		Assert.assertEquals(100,n);
	}
	@Test
	public void StringWithCommaNumbersTest() {
	    int n=c.add("100,200");
		Assert.assertEquals(300,n);
	}
	@Test
	public void StringWithNewLineNumbersTest(){
	    int n=c.add("100\n200");
		Assert.assertEquals(300,n);
	}
	@Test
	public void StringWithThreeNumbersTest() {
	    int n=c.add("100,200\n1");
		Assert.assertEquals(301,n);
	}
}
