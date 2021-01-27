package com.hackathon3.back_server.service;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.dto.stock.StockSearchResponseDto;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.MemberRepositorySupport;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.repository.StockRepositorySupport;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StockService {
	
	private final MemberRepository memberRepository;
	private final StockRepository stockRepository;
	private final StockRepositorySupport stockRepositorySupport;
	
	// GET - 주식 정보 가져오기
	@Transactional(readOnly = true)
	public List<StockSearchResponseDto> search(Long id) {
		
		Member member = memberRepository.findById(id).get();
		List<StockSearchResponseDto> stockSearchResponseDto = new ArrayList<StockSearchResponseDto>();
		
		if(member != null) {
			
			List<Stock> stocks = stockRepositorySupport.search(member);
			
			for(Stock stock : stocks) {
				
				StockSearchResponseDto dto = new StockSearchResponseDto();
				dto.setId(stock.getId());
				dto.setBalanceNo(stock.getBalanceNo());
				dto.setFirmNm(stock.getFirmNm());
				dto.setStockNm(stock.getStockNm());
				dto.setQty(stock.getQty());
				dto.setValTrade(stock.getValTrade());
				dto.setEarningRate(stock.getEarningRate());
				dto.setAssertType(stock.getAssertType());
				
				stockSearchResponseDto.add(dto);
				
			}
			
		}
		
		return stockSearchResponseDto;
	}
	
	// GET - 주식 정보 가져오기
	@Transactional(readOnly = true)
	public List<StockSearchResponseDto> search() {
		
		List<Member> members = memberRepository.findAll();
		List<StockSearchResponseDto> stockSearchResponseDto = new ArrayList<StockSearchResponseDto>();
		
		for(Member member : members) {
			
			List<Stock> stocks = stockRepositorySupport.search(member);
			
			for(Stock stock : stocks) {
				
				StockSearchResponseDto dto = new StockSearchResponseDto();
				dto.setId(stock.getId());
				dto.setBalanceNo(stock.getBalanceNo());
				dto.setFirmNm(stock.getFirmNm());
				dto.setStockNm(stock.getStockNm());
				dto.setQty(stock.getQty());
				dto.setValTrade(stock.getValTrade());
				dto.setEarningRate(stock.getEarningRate());
				dto.setAssertType(stock.getAssertType());
				
				stockSearchResponseDto.add(dto);
				
			}
		}
		return stockSearchResponseDto;
	}

}
