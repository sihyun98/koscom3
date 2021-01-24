package com.hackathon3.back_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon3.back_server.domain.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
