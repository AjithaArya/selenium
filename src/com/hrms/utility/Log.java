package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	// initalize Log4J logs
	private static Logger Log= Logger.getLogger(Log.class.getName());
	// need to create these methods , so that they can be called
	public static void info (String message) {
		Log.info(message);
		
		
	}
	public static void error(String message) {
		Log.error(message);
	}
	public static  void warn(String message) {
		
			Log.warn(message);
	}
	

	
	public static void debug(String message) {
		Log.debug(message);
		}
	

}
