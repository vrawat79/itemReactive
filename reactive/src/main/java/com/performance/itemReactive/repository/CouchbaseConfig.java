package com.performance.itemReactive.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractReactiveCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

@Configuration
@EnableReactiveCouchbaseRepositories(basePackages = { "com.performance.itemReactive.repository" })
public class CouchbaseConfig extends AbstractReactiveCouchbaseConfiguration {

	@Value("${host}")
	private String host;

	@Override
	protected List<String> getBootstrapHosts() {
		// TODO Auto-generated method stub
//		return Arrays.asList("52.26.69.69");
		System.out.println("--- Host is: " + host);
		return Arrays.asList(host);
	}

	@Override
	protected String getBucketName() {
		// TODO Auto-generated method stub
		return "items";
	}

	@Override
	protected String getUsername() {
		return "admin";
	}

	@Override
	protected String getBucketPassword() {
		return "admin123";
	}

}
