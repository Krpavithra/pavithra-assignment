package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text= driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KR");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("PAVI");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BCA");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Pleae enter ur desription");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krpavi@6@gmail.com");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dropdown = new Select(findElement);
    dropdown.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	
	String expectedResult = "View Lead | opentaps CRM";
    String actualResult = driver.getTitle();

    if (actualResult.equals(expectedResult)){
        System.out.println("Sucess");
    }
    else {
        System.out.println("Failed");
    }
	
	
	
     
}


}

}
