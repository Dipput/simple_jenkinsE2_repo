package simple_jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PullscmTest {

	@Test
	public void test()
	{
		Reporter.log("pollscn class executed",true);
		Reporter.log("jenkins class executed",true);
		
	}
}
