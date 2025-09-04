package Capabilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S56_FileDownloadScenario {
  @Test
  public void filedownload() {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.default_directory","C:\\Trainings\\SA_Automation_2025_2\\SeleniumMaven");
	  options.setExperimentalOption("prefs", prefs);
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  By file=By.linkText("testing_edge.pdf");
	  driver.findElement(file).click();
  }
}
