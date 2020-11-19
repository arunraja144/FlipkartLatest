package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartFirstWindow {

	static WebDriver wd;
	static String firstpagetext;
	static String parentid;
	static String childid;

	public static void openBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Arun\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		wd = new ChromeDriver();

		wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.navigate().to("https://www.flipkart.com/");
		System.out.println("Navigation success");
	}

	public static void escKey() {

//		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebElement input = wd.findElement(By.xpath("//div[@class='Km0IJL col
		// col-3-5']"));

		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		Actions a =new Actions(wd);
//		a.sendKeys(Keys.ESCAPE);

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click()", input);

	}

	public static void validateHomePage() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String firstpagetitle = wd.getTitle();
		System.out.println(firstpagetitle);
	}

	public static void user_searches_mobile_in_search_bar_and_hit_enter() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("samsung");
		search.sendKeys(Keys.ENTER);
	}

	public static void list_of_given_mobile_phones_should_appear() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String firstpagetext = wd.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).getText();
//		 wd.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).getText();
//		System.out.println(firstpagetext);

		List<WebElement> li = wd.findElements(
				By.xpath("//div[@class='_3pLy-c row']/child::div[@class='col col-7-12']/child::div[@class='_4rR01T']"));
		firstpagetext = li.get(0).getText();
		System.out.println(firstpagetext);
	}

	public static void user_clicks_first_searched_result_link() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement samsung = wd.findElement(By.xpath(
//				"//div[contains(text(),'Samsung Galaxy S9 (Midnight Black, 64 GB)')]"));
		List<WebElement> li = wd.findElements(
				By.xpath("//div[@class='_3pLy-c row']/child::div[@class='col col-7-12']/child::div[@class='_4rR01T']"));
		li.get(0).click();

	}

}
