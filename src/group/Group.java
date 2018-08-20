package group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	
	@Test(groups={"smoke"})
	public void tc_1()
	{
		Reporter.log("smoke test case1",true);
	}
	@Test(groups={"smoke"})
	public void tc_2()
	{
		Reporter.log("smoke test case2",true);
	}
	@Test(groups={"regression"})
	public void tc_3()
	{
		Reporter.log("smoke test case3",true);
	}
	@Test(groups={"regression"})
	public void tc_4()
	{
		Reporter.log("smoke test case4",true);
	}
	

}
