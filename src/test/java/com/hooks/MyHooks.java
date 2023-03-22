package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.base.Utility;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends Utility{
	
	@Before
	public void beforeScenario1(Scenario s) {
		System.out.println("Hooks-beforeScenario1");
		String name = s.getName();
		System.out.println(name);
	}
	
	@After
	public void afterScenario(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] fbImage = tk.getScreenshotAs(OutputType.BYTES);	
			s.embed(fbImage,"image/png" );
		}
		
		else {
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] fbImage = tk.getScreenshotAs(OutputType.BYTES);	
			s.embed(fbImage,"image/png" );
		}
		
		
		
		
	
	

	}
	
	
}
