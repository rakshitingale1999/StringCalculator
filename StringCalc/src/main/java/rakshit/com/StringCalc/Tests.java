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
}
