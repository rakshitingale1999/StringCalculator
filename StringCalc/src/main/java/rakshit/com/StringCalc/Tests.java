package rakshit.com.StringCalc;

import org.junit.Test;
import org.junit.Assert;

public class Tests {
	Calculator c=new Calculator();
	@Test
	public void EmptyStringTest() throws Exception{
	    int n=c.add("");
		Assert.assertEquals(0,n);
	}
	@Test
	public void StringWithOneNumberTest() throws Exception  {
	    int n=c.add("100");
		Assert.assertEquals(100,n);
	}
	@Test
	public void StringWithCommaNumbersTest() throws Exception {
	    int n=c.add("100,200");
		Assert.assertEquals(300,n);
	}
	@Test
	public void StringWithNewLineNumbersTest() throws Exception{
	    int n=c.add("100\n200");
		Assert.assertEquals(300,n);
	}
	@Test
	public void StringWithThreeNumbersTest() throws Exception {
	    int n=c.add("100,200\n1");
		Assert.assertEquals(301,n);
	}
	@Test
	public void StringNegativeTest() throws Exception {
	   c.add("-1");
	}
	@Test
	public void StringWithGreaterThanThousandTest() throws Exception {
	    int n=c.add("100,1001\n1");
		Assert.assertEquals(101,n);
	}
	@Test
	public void StringWithDiffDeliTest() throws Exception {
	    int n=c.add("//;\n1;2");
		Assert.assertEquals(3,n);
	}
}
