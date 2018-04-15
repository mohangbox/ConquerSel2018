//1. Write a program-How do you find broken links in a page
package dailyQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DailyQuestion_Day10_MY_Answer {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele= links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url, i);	
		}
		Thread.sleep(5000);
		driver.close();
	}
	
	public static void verifyLinkActive(String linkUrl, int i)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           httpURLConnect.setConnectTimeout(3000);
           httpURLConnect.connect();
           
           switch(httpURLConnect.getResponseCode())
           {
           case 200: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage()); break;
           case 201: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_CREATED); break;
           case 202: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_ACCEPTED); break;
           case 400: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_BAD_REQUEST); break;
           case 401: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_UNAUTHORIZED); break;
           case 402: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_PAYMENT_REQUIRED); break;
           case 403: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_FORBIDDEN); break;
           case 404: System.out.println(i+" - "+linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND); break;
           }
        } catch (Exception e) {
           
        }
    }



}


/* 2. Difference between Xpath Locator and CSSselector locator?

XPath --> we can search elements backward or forward in the DOM hierarchy. This means that with XPath we can locate a parent element using a child element
CSS --> it will work only in a forward direction. */