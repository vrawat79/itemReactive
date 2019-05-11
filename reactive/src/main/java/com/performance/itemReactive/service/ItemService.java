package com.performance.itemReactive.service;

import com.performance.itemReactive.domain.Item;

import reactor.core.publisher.Flux;

public interface ItemService {
	
	public Flux<Item> findByCategory(String category);

}
