package com.performance.itemReactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.performance.itemReactive.domain.Item;

import com.performance.itemReactive.service.ItemService;

import reactor.core.publisher.Flux;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@GetMapping(path="/items/{category}")
	public Flux<Item> getItemsbyCategory(String category){
		
		return itemService.findByCategory(category);
	}

}
