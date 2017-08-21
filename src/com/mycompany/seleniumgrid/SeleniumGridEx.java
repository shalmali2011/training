package com.mycompany.seleniumgrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridEx {

	public static void main(String[] args) {
		//
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		cap.setCapability(CapabilityType.PLATFORM, Platform.WIN10);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub", cap));
		
	}

}
