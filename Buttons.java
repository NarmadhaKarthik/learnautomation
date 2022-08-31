package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.get("https://www.leafground.com/");
		wd.navigate().to("https://www.leafground.com/button.xhtml;jsessionid=node0ff5n1o836h5x1utg4qag2fzfp38470.node0");
		wd.manage().window().maximize();
		
		
		//Find the position
	WebElement position = wd.findElement(By.xpath("//*[@id=\'j_idt88:j_idt94\']/span[2]"));
	Point point=position.getLocation();
	int Xvalue=point.getX();
	int Yvalue=point.getY();
	System.out.println("Xvalue is "+Xvalue+ " Yvalue is "+Yvalue);
	 
	
	//Find the colour
	WebElement colour =wd.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));
	Actions action= new Actions(wd);
	action.moveToElement(colour).build().perform();
	String submitkeycolour =wd.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span")).getCssValue("background-color");
	System.out.println(submitkeycolour);

	}

}
