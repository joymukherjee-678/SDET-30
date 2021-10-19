package com.crm.contactTest;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void sampleTest() {
		String URL = System.getProperty("url");
		//System.out.println(URL);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
	
}
