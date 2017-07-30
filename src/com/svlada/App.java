package com.svlada;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.svlada.ssh.JschLogger;
import com.svlada.ssh.logger.PublicKeySshSession;

/**
 * Demonstrate public key authentication and execution of simple command over SSH.
 * 
 * @author vladimir.stankovic (svlada@gmail.com)
 *
 */
public class App {
	
	static final Logger logger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		Properties config = App.getConfig(args);
		
		final PublicKeySshSession session = new PublicKeySshSession.Builder(
				config.getProperty("host"), 
				config.getProperty("username"), 
				Integer.parseInt(config.getProperty("port")), 
				config.getProperty("privateKeyPath")).logger(new JschLogger()).build();
		
		System.out.println("Hello 2");
		
		if (session == null) {
			System.exit(-1);
		}
		
        System.out.println("session connected.....");
//		session.execute("echo \"Sit down, relax, mix yourself a drink and enjoy the show...\" >> /tmp/test.out");
		session.execute("mkdir /home/dmuser/subh/sshclient");
		
	}
	
	public static Properties getConfig(String[] args) {
		String profile = "local";
		
		if (args != null && args.length > 0) {
			profile = args[0];
		}
        
		Properties properties = new Properties();
        
		try {
			properties.load(App.class.getClassLoader().getResourceAsStream("resources/config/" + profile + "/ssh.config"));
		} catch (IOException e) {
			throw new RuntimeException("Failed to load properties.", e);
		}
        
		return properties;
	}

}
