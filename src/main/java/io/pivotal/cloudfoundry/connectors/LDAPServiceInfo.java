package io.pivotal.cloudfoundry.connectors;

import org.springframework.cloud.service.UriBasedServiceInfo;
import org.springframework.cloud.service.ServiceInfo.ServiceLabel;


@ServiceLabel("ldap")
public class LDAPServiceInfo extends UriBasedServiceInfo {
	
	public static final String URI_SCHEME = "ldap";
	

	public LDAPServiceInfo(String id, String uri) {
		super(id, uri);
	}

}
