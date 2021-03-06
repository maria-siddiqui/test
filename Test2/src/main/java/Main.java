package main.java;

import java.util.Scanner;


import org.apache.log4j.Logger;

public class Main {

	private static Logger log=Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
	//	log.addAppender(new ConsoleAppender());
		// to log debug messages:
		Scanner sc=new Scanner(System.in);
		log.trace(sc);
		
		try {
			int n=sc.nextInt();
			log.trace(n);
			
		} catch (Exception e) {
			log.error("error on using scnnar", e);
		}
		log.debug("This is a debug message");

		// to log warning messages:
		log.warn("Warning messages");

		// to log exceptions:
		try
		{
			// throws an exception here
		}
		catch(Exception x)
		{
		log.error("Error doing operation X:",x);
		}

	}

}
