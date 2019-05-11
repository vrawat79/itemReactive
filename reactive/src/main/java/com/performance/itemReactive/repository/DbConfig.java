//package com.performance.itemReactive.repository;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.couchbase.client.java.AsyncBucket;
//import com.couchbase.client.java.Bucket;
//import com.couchbase.client.java.Cluster;
//import com.couchbase.client.java.CouchbaseCluster;
//
//@Configuration
//public class DbConfig {
//
//	@Bean
//	public AsyncBucket getBucket() {
//		Cluster cluster = CouchbaseCluster.create("52.26.69.69");
//		cluster.authenticate("Administrator", "Administrator");
//		Bucket bucket = cluster.openBucket("items");
//		return bucket.async();
//	}
//
//}
