package com.hackathon3.back_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.domain.Subscribe;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.StockRepository;
import com.hackathon3.back_server.repository.SubscribeRepository;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(MemberRepository memberRepository, StockRepository stockRepository, SubscribeRepository subscribeRepository) {
		  
//		  MemberRepository memberRepository = ;
//		  StockRepository stockRepository;

	      return args -> {
	    	  
	    	  //Member
	    	  Member member1 = new Member();
	    	  member1.setName("차예린");
	    	  member1.setGrade("LV.1 파개미");
	    	  member1.setAge(28);
	    	  member1.setJob("사무직");
	    	  member1.setInvestOpt("투자주식");
	    	  member1.setSalary(5000);
	    	  member1.setProperty(3000);
	    	  member1.setProfile("나는야 파개미");
	    	  log.info("preloading " + memberRepository.save(member1));
	    	  
	    	  Member member2 = new Member();
	    	  member2.setName("윤하은");
	    	  member2.setGrade("LV.2 초개미");
	    	  member2.setAge(28);
	    	  member2.setJob("사무직");
	    	  member2.setInvestOpt("단타위주");
	    	  member2.setSalary(5000);
	    	  member2.setProperty(3000);
	    	  member2.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member2));
	    	  
	    	  Member member3 = new Member();
	    	  member3.setName("안기현");
	    	  member3.setGrade("LV3. 노개미");
	    	  member3.setAge(29);
	    	  member3.setJob("사무직");
	    	  member3.setInvestOpt("투자주식");
	    	  member3.setSalary(5000);
	    	  member3.setProperty(3000);
	    	  member3.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member3));
	    	  
	    	  Member member4 = new Member();
	    	  member4.setName("조태율");
	    	  member4.setGrade("LV4. 빨개미");
	    	  member4.setAge(29);
	    	  member4.setJob("사무직");
	    	  member4.setInvestOpt("위험추구");
	    	  member4.setSalary(5000);
	    	  member4.setProperty(3000);
	    	  member4.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member4));

	    	  Member member5 = new Member();
	    	  member5.setName("노영록");
	    	  member5.setGrade("LV.1 파개미");
	    	  member5.setAge(27);
	    	  member5.setJob("사무직");
	    	  member5.setInvestOpt("투자주식");
	    	  member5.setSalary(5000);
	    	  member5.setProperty(3000);
	    	  member5.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member5));

	    	  Member member6 = new Member();
	    	  member6.setName("이예은");
	    	  member6.setGrade("LV.2 초개미");
	    	  member6.setAge(29);
	    	  member6.setJob("사무직");
	    	  member6.setInvestOpt("투자주식");
	    	  member6.setSalary(5000);
	    	  member6.setProperty(3000);
	    	  member6.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member6));
	    	  
	    	  Member member7 = new Member();
	    	  member7.setName("이영인");
	    	  member7.setGrade("LV3. 노개미");
	    	  member7.setAge(29);
	    	  member7.setJob("사무직");
	    	  member7.setInvestOpt("투자주식");
	    	  member7.setSalary(5000);
	    	  member7.setProperty(3000);
	    	  member7.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member7));
	    	  
	    	  Member member8 = new Member();
	    	  member8.setName("박용수");
	    	  member8.setGrade("LV4. 빨개미");
	    	  member8.setAge(28);
	    	  member8.setJob("사무직");
	    	  member8.setInvestOpt("위험은조금만");
	    	  member8.setSalary(5000);
	    	  member8.setProperty(3000);
	    	  member8.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member8));
	    	  
	    	  Member member9 = new Member();
	    	  member9.setName("김태현");
	    	  member9.setGrade("LV.1 파개미");
	    	  member9.setAge(22);
	    	  member9.setJob("사무직");
	    	  member9.setInvestOpt("위험은조금만");
	    	  member9.setSalary(5000);
	    	  member9.setProperty(3000);
	    	  member9.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member9));
	    	  
	    	  Member member10 = new Member();
	    	  member10.setName("김수아");
	    	  member10.setGrade("LV.2 초개미");
	    	  member10.setAge(29);
	    	  member10.setJob("사무직");
	    	  member10.setInvestOpt("투자주식");
	    	  member10.setSalary(5000);
	    	  member10.setProperty(3000);
	    	  member10.setProfile("");
	    	  log.info("preloading " + memberRepository.save(member10));
	    	
	    	  // Stock
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
	    	  
	    	  Subscribe subscribe1_1 = new Subscribe();
	    	  subscribe1_1.setSubscriber_id(Long.valueOf(2));
	    	  log.info("Preloading " + subscribeRepository.save(subscribe1_1));
	    	  
	      };
	  }
}
