package mobileWorld;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Launch {
		@Test(dependsOnMethods= {"Lanching_the_Browser"})
		public void Sigup_for_mobiles() throws InterruptedException {
		WebElement Signin = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
		Signin.click();
		WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		Signup.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='myName']"));
		firstname.sendKeys("Harsha");
		WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Last_name.sendKeys("Gowda");
		WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
		Email.sendKeys("harshagowda@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
		password.sendKeys("harsha@2698");
		WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
		Phone_number.sendKeys("8660101293");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
		bio_story.sendKeys("Hey this is Harsha Gowda");
		driver.findElement(By.xpath("//input[@type='date']")).click();
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
		Alert Al = driver.switchTo().alert();
		Al.accept();
		Thread.sleep(2000);
		WebElement user_name = driver.findElement(By.id("username"));
		user_name.click();
		user_name.sendKeys("harshagowda@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.click();
		Password.sendKeys("harsha@2698");
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(1000);
		}
		}
