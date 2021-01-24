package com.hackathon3.back_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.StockRepository;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(MemberRepository memberRepository, StockRepository stockRepository) {
		  
//		  MemberRepository memberRepository = ;
//		  StockRepository stockRepository;

	      return args -> {
	    	  
	    	  Member member1 = new Member();
	    	  member1.setName("박시현");
	    	  member1.setGrade("C");
	    	  member1.setAge(24);
	    	  member1.setJob("student");
	    	  member1.setInvestOpt("안전추구형");
	    	  member1.setSalary(300);
	    	  member1.setProperty(500);
	    	  member1.setProfile("안녕");
	    	  log.info("Preloading " + memberRepository.save(member1));
	    	
	    	  Stock stock1_1 = new Stock();
	    	  stock1_1.setBalanceNo("123456789");
	    	  stock1_1.setMember(member1);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock1_1.setFirmNm("NH투자증권");
	    	  stock1_1.setStockNm("삼성전자");
	    	  stock1_1.setQty(5);
	    	  stock1_1.setValTrade(90000);
	    	  stock1_1.setAssertType("주식");
	    	  log.info("Preloading " + stockRepository.save(stock1_1));
	    	  
	      };
	  }
}
