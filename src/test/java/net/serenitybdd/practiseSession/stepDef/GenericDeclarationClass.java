package net.serenitybdd.practiseSession.stepDef;

import java.util.Properties;

import org.junit.rules.ErrorCollector;

public class GenericDeclarationClass {
	
	public static String Configpath=System.getProperty("user.dir")+"\\config.properties";
	public final ErrorCollector collector= new ErrorCollector();
	public static Properties prop;
}
