import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		 
		List<WebElement> l1;
		l1 = driver.findElements(By.xpath(" //div[@class='pcTkSc']"));
	
		 Thread.sleep(3000);
		int lenght=l1.size();
		System.out.println(lenght);
		
    	for (int i=0;i<l1.size();i++)
		{
			System.out.println("text :"+ l1.get(i).getText());
		    
			if(l1.get(i).getText().contains("selenium interview questions"))
		{
			l1.get(i).click();
			}
		}
	}

}


//for (WebElement l :l1)

	 //   {
	    //	System.out.println("options :"+ l.getText());