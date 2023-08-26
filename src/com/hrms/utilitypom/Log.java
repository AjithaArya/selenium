package com.hrms.utilitypom;

import org.apache.log4j.Logger;

public class Log {
//	private static Logger Log= Logger.getLogger(Log.class.getName());
	// initalize Log4J logs
	private static Logger Log= Logger.getLogger(Log.class.getName());
	// need to create these methods , so that they can be called
	public static void info (String message) {
		Log.info(message);
		
		
	}
}
