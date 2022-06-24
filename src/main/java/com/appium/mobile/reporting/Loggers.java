package com.appium.mobile.reporting;

import java.util.logging.Logger;

import org.testng.Reporter;

public class Loggers {

	private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private static void getConsolLog(String msg) {
		logger.info(msg);
	}
	
	private static void getTestNgReporterLog(String msg) {
		Reporter.log(msg +"<br>");
	}
	
	public static void log(String msg) {
		getConsolLog(msg);
		getTestNgReporterLog(msg);
	}
}
