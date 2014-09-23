package io.pivotal.cloudfoundry.connectors.test;

import javax.naming.directory.DirContext;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;

public class MockCloudConfig extends AbstractCloudConfig {

	@Bean
	public DirContext createContext(){
		return connectionFactory().service("ldap", DirContext.class);
	}
	
}
