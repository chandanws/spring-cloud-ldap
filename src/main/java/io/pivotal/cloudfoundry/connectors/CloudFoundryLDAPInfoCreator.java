package io.pivotal.cloudfoundry.connectors;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class CloudFoundryLDAPInfoCreator extends CloudFoundryServiceInfoCreator<LDAPServiceInfo> {
	
	public CloudFoundryLDAPInfoCreator(){
		super(new Tags("ldap"),LDAPServiceInfo.URI_SCHEME);
	}
	
	public CloudFoundryLDAPInfoCreator(Tags tags) {
		super(tags);
	}

	@Override
	public LDAPServiceInfo createServiceInfo(Map<String, Object> serviceData) {
		String id = (String) serviceData.get("name");
		
		Map<String,Object> credentials = (Map<String, Object>) serviceData.get("credentials");
		String uri = getStringFromCredentials(credentials, "uri", "url");
		
		return new LDAPServiceInfo(id, uri);
	}

}
