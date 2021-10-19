package com.crm.orgTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;



public class OrgTest {

	@Test
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	@Test(groups="smoke testing")
	public void editOrgTest() {
		System.out.println("execute editOrgTest");
	}
}
