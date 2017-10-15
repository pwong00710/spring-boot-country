package org.arpit.java2blog;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpringBootCountryApplicationTests {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBootCountryApplicationTests.class);
	private static final String baseURL = "http://localhost:2088/";

//	@Test
//	public void contextLoads() {
//	}
	
	@Test
	public void stage1_getAllCountriesTest() throws Exception {		
		
	}
	
	@Test
	public void stage2_addCountryTest() throws Exception {
	}
		
	@Test
	public void stage3_updateCountryTest() throws Exception {
	}
	
	@Test
	public void stage4_getCountryTest() throws Exception {
	}
	
	@Test
	public void stage5_deleteCountryTest() throws Exception {
	}	
}
