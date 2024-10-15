package Test1;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest()
	{
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String pass=System.getProperty("pass");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(pass);
		System.out.println("execute create org test");
	}
	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modify org test");
	}
}
