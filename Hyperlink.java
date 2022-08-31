package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Hyperlink {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.get("https://www.leafground.com/");
		wd.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0ukfpmxhzochg1sr9jioo59o9w22781.node0");
		wd.manage().window().maximize();
		//Thread.sleep(3000);
		//WebElement Element = wd.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		//Element.click();
		//Thread.sleep(3000);
		//WebElement Hyperlinkbutton = wd.findElement(By.xpath("//*[@id=\"menuform:m_link\"]/a/span"));
		//Hyperlinkbutton.click();
		
		//Code:
			WebElement hyperlink = wd.findElement(By.linkText("Go to Dashboard"));
			hyperlink.click();
			wd.navigate().back();
			

	}

}
