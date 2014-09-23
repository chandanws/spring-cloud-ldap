package io.pivotal.cloudfoundry.connectors.test;

import java.util.Properties;

import javax.naming.directory.DirContext;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MockCloudConfig.class)

/**
 * 
 * To run this test you will need:
 * 
 * An ldap server available (Apache DS works fine)
 * 
 * Set two environment variables:
 * 
 * VCAP_APPLICATION - copy a sample from http://docs.run.pivotal.io/devguide/deploy-apps/environment-variable.html
 * VCAP_SERVICES {"user-provided":[{"name":"ldap","label":"user-provided","tags":[],"credentials":{"uri":"ldap://uid=admin,ou=system:secret@localhost:10389/dc=org"}}]}
 * 
 * @author vcarvalho
 *
 */
public class LDAPTest {
	
	
	
	@Autowired
	private DirContext context;
	
	@Test
	public void printContext() throws Exception {
		
	}
}
