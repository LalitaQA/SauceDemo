package demo;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups = "smoke")
	public void movieTest()
	{
		System.out.println("Swapped");
		System.out.println("Titanic");
		System.out.println("ABC");
	}

}
