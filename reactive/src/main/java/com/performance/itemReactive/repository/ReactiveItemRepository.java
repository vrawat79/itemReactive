package com.performance.itemReactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.performance.itemReactive.domain.Item;

import reactor.core.publisher.Flux;

public interface ReactiveItemRepository extends ReactiveCrudRepository<Item, String>{
	
	public Flux<Item> findByCategory(String category);

}
