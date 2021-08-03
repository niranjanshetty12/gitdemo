package qaclickacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	
	@BeforeTest
	
	public void config(){
		
		//extent reports,extent spark reporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Rahul Shetty");
	}
	
	
@Test

	public void initialDemo() {
		
		ExtentTest test= extent.createTest("Initial Demo");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp840-G3\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	System.out.println(driver.getTitle());
	
	System.out.println("git demo");
	System.out.println("git demo1");
	
	test.fail("result not matching");
	extent.flush();
		
	}
	

}
