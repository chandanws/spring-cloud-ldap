##Cloud connectors for LDAP

Extensions to spring-cloud-connectors to provide ldap integration.

This connector expects a custom user provide service with the following format: {"uri":"ldap://user:password@host:port"}

To use it

	@Bean
	public DirContext createContext(){
		return connectionFactory().service("service-id", DirContext.class);
	}
	
	Just replace "service-id" by the identifier of your custom user provided service
