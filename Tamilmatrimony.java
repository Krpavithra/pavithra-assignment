package mave;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tamilmatrimony {
	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("NAME")).sendKeys("pavi");
		driver.findElement(By.id("genderfemale")).sendKeys("click");
		//dobday
	WebElement dayDropDown = driver.findElement(By.name("DOBDAY"));
	Select selectDay=new Select(dayDropDown);
	selectDay.selectByValue("29");
	//dobmonth
	WebElement monthDropDown=driver.findElement(By.name("DOBMONTH"));
	Select selectMonth=new Select(monthDropDown);
	selectMonth.selectByValue("11");
	//dobyear
	WebElement yearDropDown=driver.findElement(By.name("DOBYEAR"));
	Select selectYear=new Select(yearDropDown);
	selectYear.selectByValue("2002");
	//religion
	
	WebElement religionDropDown = driver.findElement(By.id("RELIGION"));
	Select selectReligion=new Select(religionDropDown);
	selectReligion.selectByValue("1");
	//mother tongue
	WebElement motherTongueDropDown=driver.findElement(By.name("MOTHERTONGUE"));
	Select selectmotherTongue=new Select(motherTongueDropDown);
	selectmotherTongue.selectByValue("12");
	//country
	WebElement countryDropDown=driver.findElement(By.name("COUNTRY"));
	Select selectCountry=new Select(countryDropDown);
	selectCountry.selectByValue("1");
	//mob no
	driver.findElement(By.id("MOBILENO")).sendKeys("98765433210");
	//Email id
	driver.findElement(By.id("EMAIL")).sendKeys("pavi123@gamil.com");
	//password
	driver.findElement(By.name("PASSWD1")).sendKeys("abcd1234");
	//close
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
}
}