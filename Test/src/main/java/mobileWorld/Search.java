package mobileWorld;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Search extends Launch
{
@Test(priority = 2)
public void search() throws InterruptedException
{
driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
WebElement ele = driver.findElement(By.xpath("//b[.='All Mobile Details']"));
driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13");
Thread.sleep(2000);
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,700)");
driver.findElement(By.xpath("(//a[.='Order'])[4]")).click();
}
@Test(priority = 3)
public void Order() throws InterruptedException, Exception
{
Set<String> window = driver.getWindowHandles();
Iterator<String>it = window.iterator();
Thread.sleep(2000);
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
driver.findElement(By.id("inputFirstName")).sendKeys("soumya");
driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("kulkarni");
driver.findElement(By.id("inputEmail")).sendKeys("Sk@gmail.com");
driver.findElement(By.id("inputPassword")).sendKeys("Sou@123");
driver.findElement(By.id("flexRadioDefault2")).click();
driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("123456");
driver.findElement(By.id(" address1")).sendKeys("asdvg hhjn jnhhj jjujn");
driver.findElement(By.id("address2")).sendKeys("dffgfg hhhb hhhh hhh");
driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
WebElement dropdown = driver.findElement(By.id("inputState"));
Select sle= new Select(dropdown);
sle.selectByVisibleText("Karnataka");
driver.findElement(By.id("inputZip")).sendKeys("560010");
driver.findElement(By.xpath("//*[.='Apple']")).click();
driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("3");
WebElement dpdwn2 = driver.findElement(By.id("bought"));
Select sle2= new Select(dpdwn2);
sle2.selectByValue("0");
driver.findElement(By.xpath("//*[@id='gridCheck1']")).click();
driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Robot ro=new Robot();
for(int i=0;i<2;i++)
{
ro.keyPress(KeyEvent.VK_TAB);
}
ro.keyRelease(KeyEvent.VK_TAB);
ro.keyPress(KeyEvent.VK_ENTER);
ro.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
}
}
