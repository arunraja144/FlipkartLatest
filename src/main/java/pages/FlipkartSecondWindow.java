package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class FlipkartSecondWindow extends FlipkartFirstWindow {

	static String parenttext;
	static String p;
	static String childtext;
	static String p2;

	public static void child_Window_Switch() throws InterruptedException {
		System.err.println("aaa" + wd.getTitle());
		Thread.sleep(5000);
		System.err.println("bbb" + wd.getTitle());
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> child = wd.getWindowHandles();
		Iterator<String> it = child.iterator();
		parentid = it.next();
		childid = it.next();
		wd.switchTo().window(childid);
		System.err.println("ccc" + wd.getTitle());

	}

	public static void searched_mobile_should_appear_with_details() {

		System.out.println("Capturing details....");
	}

	public static void mobile_details_should_be_captured_for_validation() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// span[@class='_35KyD6']

//		WebDriverWait wait=new WebDriverWait(wd, 30);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='container']//h1/span")));
//		//div[@id='container']//h1//span
		WebElement samsung2 = wd.findElement(By.xpath("//h1[@class='yhB1nd']/child::span[@class='B_NuCI']"));

		parenttext = samsung2.getText();
		System.out.println(parenttext);
		WebElement parentprice = wd.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		p = parentprice.getText();
		System.out.println(p);

	}

	public static void delivery_details_is_entered_and_item_added_to_cart() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement pincode = wd.findElement(By.xpath("//input[@class='_36yFo0']"));
		pincode.sendKeys("600044");
		WebElement check = wd.findElement(By.xpath("//span[@class='_2P_LDn']"));
		check.click();
		WebElement addtocart = wd.findElement(By.xpath("//button[text()='ADD TO CART']"));
		addtocart.click();
		int i = 1/0;
	}

	public static void mobile_details_should_be_validated_and_compared_with_previous_data() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement text = wd.findElement(By.xpath("//div[@class='_2-uG6-']"));
		try {
			childtext = text.getText();
			System.out.println(childtext);
			WebElement p2 = wd.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
			String childprice = p2.getText();
			System.out.println(childprice);

			// Data validation
			if (parenttext.contains(childtext)) {
				System.out.println("text validated");
				if (p.equals(childprice)) {
					System.out.println("price validated");

				} else {
					System.out.println("Data mismatch");
				}

			}
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			WebElement textnew = wd.findElement(By.xpath("//div[@class='_2-uG6-']"));
			childtext = textnew.getText();
			System.out.println(childtext);
			WebElement p2 = wd.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
			String childprice = p2.getText();
			System.out.println(childprice);

			// Data validation
			if (parenttext.contains(childtext)) {
				System.out.println("text validated");
				if (p.equals(childprice)) {
					System.out.println("price validated");

				} else {
					System.out.println("Data mismatch");
				}

			}

		}
	}

	public static void screen_is_closed_if_the_mobile_details_matches() {
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wd.close();
		wd.switchTo().window(parentid);
		wd.close();
		System.out.println("--------SUCESS----------");

	}
}
