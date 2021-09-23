package org.automationtest.TESTNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test1 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004992\\Desktop\\Automation\\msedgedriver.exe");
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com/");
		String vTitle=driver.getTitle();
		System.out.println("The title is " +vTitle);
		Thread.sleep(5000);
		driver.close();

	}

}
