package com.hackathon3.back_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.back_server.dto.stock.StockSearchResponseDto;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.service.StockService;

@RestController
public class StockController {
	
	private final StockRepository repository;
	private final StockService stockService;
	
	StockController(StockRepository repository, StockService stockService){
		this.repository = repository;
		this.stockService = stockService;
	}
	
	// SEARCH
	@GetMapping("/api/stock/search")
	public List<StockSearchResponseDto> search(){
		return stockService.search();
	}
	
	// SEARCH
	@GetMapping("/api/stock/search/{id}")
	public List<StockSearchResponseDto> search(@PathVariable Long id){
		return stockService.search(id);
	}

}
