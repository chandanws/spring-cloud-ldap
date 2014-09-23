package io.pivotal.cloudfoundry.connectors;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.springframework.cloud.service.AbstractServiceConnectorCreator;
import org.springframework.cloud.service.ServiceConnectorConfig;


public class LDAPConnectorCreator extends AbstractServiceConnectorCreator<DirContext, LDAPServiceInfo> {

	@Override
	public DirContext create(LDAPServiceInfo serviceInfo, ServiceConnectorConfig serviceConnectorConfig) {
		Hashtable<String,String> env = new Hashtable<>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL,serviceInfo.getScheme()+"://"+serviceInfo.getHost()+":"+serviceInfo.getPort());
		env.put(Context.SECURITY_PRINCIPAL, serviceInfo.getUserName());
		env.put(Context.SECURITY_CREDENTIALS, serviceInfo.getPassword());
		DirContext ctx;
	      try {
	         ctx = new InitialDirContext(env);
	      } catch (NamingException e) {
	         throw new RuntimeException(e);
	      }
		return ctx;
	}

}
