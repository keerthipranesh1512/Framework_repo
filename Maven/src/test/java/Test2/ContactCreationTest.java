package Test2;

import org.testng.annotations.Test;

public class ContactCreationTest {
@Test
public void creContactTest()
{
	String url=System.getProperty("url");
	String browser=System.getProperty("browser");
	String username=System.getProperty("username");
	String pass=System.getProperty("pass");
	System.out.println(url);
	System.out.println(browser);
	System.out.println(username);
	System.out.println(pass);
	System.out.println("execute create contact test");
}
@Test
public void deleteContactTest()
{
	System.out.println("execute modify contact test");
}
}
