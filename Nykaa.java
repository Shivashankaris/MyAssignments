package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( java.time.Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		WebElement brands=driver.findElement(By.xpath("//a[text()='brands']"));
		Actions build=new Actions(driver);
	build.moveToElement(brands).perform();
		
		WebElement text=driver.findElement(By.id("brandSearchBox"));
		text.sendKeys("L'Oreal Paris");
		WebElement text2=driver.findElement(By.linkText("L'Oreal Paris"));
		text2.click();
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement pop=driver.findElement(By.xpath("//span[text()='Sort By : popularity']"));
		pop.click();
		
		WebElement custom=driver.findElement(By.xpath("//span[text()='customer top rated']"));
		custom.click();
		
		WebElement cate=driver.findElement(By.xpath("//span[text()='Category']"));
		cate.click();
		
		WebElement hair=driver.findElement(By.xpath("(//span[@class='filter-name '])[2]"));
		hair.click();
		
		WebElement care=driver.findElement(By.xpath("//span[text()='Hair Care']"));
		care.click();
		
		WebElement sha=driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]"));
		sha.click();
		WebElement concern=driver.findElement(By.xpath("//span[text()='Concern']"));
		concern.click();
		WebElement color=driver.findElement(By.xpath("//span[text()='Color Protection']"));
		color.click();
		
		Thread.sleep(5000);
		
		WebElement shampoo=driver.findElement(By.xpath("//div[@class='css-43m2vm']"));
		shampoo.click();
		Set<String>w1=driver.getWindowHandles();
		for (String newwin : w1) {
			driver.switchTo().window(newwin);
			
		}
		
		WebElement size=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		
		Select select=new Select(size);
		select.selectByValue("0");
		
		WebElement mrpp=driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span[2])[1]"));
		String mrp=mrpp.getText();
		System.out.println(mrp);
		
		WebElement addTobag=driver.findElement(By.xpath("(//button[@class=' css-1qvy369']//span)[1]"));
		addTobag.click();
		
		WebElement sbag=driver.findElement(By.xpath("//button[@class='css-g4vs13']"));
		sbag.click();
		driver.switchTo().frame(0);
		WebElement rate=driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span"));
		String rate1=rate.getText();
		System.out.println(rate1);
		
		WebElement proceed=driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]"));
		proceed.click();
		
		WebElement gg=driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		gg.click();
		
		WebElement gg2=driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']"));
		gg2.click();
		WebElement gg4=driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3'])[2]"));
		gg4.click();
		WebElement gg3=driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]"));
		String rate2=gg3.getText();
		System.out.println(rate2);
		
		if(rate1.equals(rate2)) {
			System.out.println("same");
			
		}
		driver.quit();
		
	}

}

