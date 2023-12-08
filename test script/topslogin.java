package testng.testn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class topslogin {
	static WebDriver driver;

	@BeforeClass
	public static void openbrowser() {
		String url = "https://careercenter.tops-int.com/";
		driver = new DriverConnection().getConnection(url);
	}

	@Test(dataProvider = "dp")
	public void login(String mobile, String password) throws InterruptedException {
		WebElement mob = driver.findElement(By.id("mobile"));
		mob.clear();
		mob.sendKeys(mobile);
		WebElement pass = driver.findElement(By.id("password"));
		System.out.println("password get");
		pass.clear();
		pass.sendKeys(password);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/input"));
		login.click();
	}

	@DataProvider(name = "dp")
	public Object[][] passData() {
		Object o[][] = new Object[4][2];
		o[0][0] = "2121";
		o[0][1] = "2199";

		o[1][0] = "9";
		o[1][1] = "9558870650";

		o[2][0] = "9558870650";
		o[2][1] = "90";

		o[3][0] = "9558870650";
		o[3][1] = "9558870650";

		return o;

	}
}
