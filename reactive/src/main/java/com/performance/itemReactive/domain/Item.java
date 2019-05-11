package com.performance.itemReactive.domain;


import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Item {
	
	@Id
	private String id;
	
	@Field
	private String category;
	
	@Field
	private String model;
	
	@Field
	private String description;
	

}
