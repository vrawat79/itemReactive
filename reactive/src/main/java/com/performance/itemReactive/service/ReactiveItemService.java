package com.performance.itemReactive.service;

import org.springframework.stereotype.Service;

import com.performance.itemReactive.domain.Item;
import com.performance.itemReactive.repository.ReactiveItemRepository;

import reactor.core.publisher.Flux;

@Service
public class ReactiveItemService implements ItemService {

	private ReactiveItemRepository reactiveItemRepo;

	@Override
	public Flux<Item> findByCategory(String category) {
		// TODO Auto-generated method stub
		return reactiveItemRepo.findByCategory(category);
	}

}
