package me.matiasormazabal.testing.util;

import java.util.Properties;

public class AutomationProperties {

	private Properties props = null;

	public static String AUTOMATION_LOCAL_BROWSER;
	public static String TEST_CASES;
	
	public AutomationProperties() {
		props = new Properties();
		try{
			props.load(this.getClass().getClassLoader().getResourceAsStream("config/automation.properties"));
			AUTOMATION_LOCAL_BROWSER = getConfigProperty("automation.local.browser");			
			TEST_CASES = getConfigProperty("test.cases");
		}catch(Exception er) { 
			throw new GenericTestingException("Error loading properties!");
		}	
	}	
		
	private String getConfigProperty(String value) {
		return getConfigPropertyDefault(value, "");
	}
	
	private String getConfigPropertyDefault(String value, String defaultValue) {
		boolean isEnvSet = System.getProperty(value) != null;
		boolean isConfigSet = props.getProperty(value) != null;
		return isEnvSet ? System.getProperty(value) : isConfigSet ? props.getProperty(value) :  defaultValue;
	}
	
}