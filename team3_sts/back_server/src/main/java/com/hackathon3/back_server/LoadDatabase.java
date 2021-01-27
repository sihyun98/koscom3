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
	    	  member1.setUsername("koscom1");
	    	  member1.setPassword("1234");
	    	  member1.setGrade("LV.1 파개미");
	    	  member1.setAge(28);
	    	  member1.setJob("사무직");
	    	  member1.setInvestOpt("투자주식");
	    	  member1.setSalary(5797);
	    	  member1.setProperty(3020);
	    	  member1.setProfile("나는야 파개미1");
	    	  log.info("preloading " + memberRepository.save(member1));
	    	  
	    	  Member member2 = new Member();
	    	  member2.setName("윤하은");
	    	  member2.setUsername("koscom2");
	    	  member2.setPassword("1234");
	    	  member2.setGrade("LV.1 파개미");
	    	  member2.setAge(28);
	    	  member2.setJob("전문직");
	    	  member2.setInvestOpt("단타위주");
	    	  member2.setSalary(8097);
	    	  member2.setProperty(3447);
	    	  member2.setProfile("나는야 파개미2");
	    	  log.info("preloading " + memberRepository.save(member2));
	    	  
	    	  Member member3 = new Member();
	    	  member3.setName("안기현");
	    	  member3.setUsername("koscom3");
	    	  member3.setPassword("1234");
	    	  member3.setGrade("LV.1 파개미");
	    	  member3.setAge(29);
	    	  member3.setJob("교직");
	    	  member3.setInvestOpt("투자주식");
	    	  member3.setSalary(4351);
	    	  member3.setProperty(3766);
	    	  member3.setProfile("나는야 파개미3");
	    	  log.info("preloading " + memberRepository.save(member3));
	    	  
	    	  Member member4 = new Member();
	    	  member4.setName("조태율");
	    	  member4.setUsername("koscom4");
	    	  member4.setPassword("1234");
	    	  member4.setGrade("LV.1 파개미");
	    	  member4.setAge(29);
	    	  member4.setJob("관리직");
	    	  member4.setInvestOpt("위험추구");
	    	  member4.setSalary(5135);
	    	  member4.setProperty(3248);
	    	  member4.setProfile("나는야 파개미4");
	    	  log.info("preloading " + memberRepository.save(member4));

	    	  Member member5 = new Member();
	    	  member5.setName("노영록");
	    	  member5.setUsername("koscom5");
	    	  member5.setPassword("1234");
	    	  member5.setGrade("LV.1 파개미");
	    	  member5.setAge(27);
	    	  member5.setJob("사무직");
	    	  member5.setInvestOpt("투자주식");
	    	  member5.setSalary(4848);
	    	  member5.setProperty(3810);
	    	  member5.setProfile("나는야 파개미5");
	    	  log.info("preloading " + memberRepository.save(member5));

	    	  Member member6 = new Member();
	    	  member6.setName("이예은");
	    	  member6.setUsername("koscom6");
	    	  member6.setPassword("1234");
	    	  member6.setGrade("LV.1 파개미");
	    	  member6.setAge(29);
	    	  member6.setJob("자영업");
	    	  member6.setInvestOpt("투자주식");
	    	  member6.setSalary(5900);
	    	  member6.setProperty(3016);
	    	  member6.setProfile("나는야 파개미6");
	    	  log.info("preloading " + memberRepository.save(member6));
	    	  
	    	  Member member7 = new Member();
	    	  member7.setName("이영인");
	    	  member7.setUsername("koscom7");
	    	  member7.setPassword("1234");
	    	  member7.setGrade("LV.1 파개미");
	    	  member7.setAge(29);
	    	  member7.setJob("판매직");
	    	  member7.setInvestOpt("투자주식");
	    	  member7.setSalary(4228);
	    	  member7.setProperty(4920);
	    	  member7.setProfile("나는야 파개미7");
	    	  log.info("preloading " + memberRepository.save(member7));
	    	  
	    	  Member member8 = new Member();
	    	  member8.setName("박용수");
	    	  member8.setUsername("koscom8");
	    	  member8.setPassword("1234");
	    	  member8.setGrade("LV.1 파개미");
	    	  member8.setAge(28);
	    	  member8.setJob("서비스직");
	    	  member8.setInvestOpt("위험은조금만");
	    	  member8.setSalary(6581);
	    	  member8.setProperty(3523);
	    	  member8.setProfile("나는야 파개미8");
	    	  log.info("preloading " + memberRepository.save(member8));
	    	  
	    	  Member member9 = new Member();
	    	  member9.setName("김태현");
	    	  member9.setUsername("koscom9");
	    	  member9.setPassword("1234");
	    	  member9.setGrade("LV.1 파개미");
	    	  member9.setAge(22);
	    	  member9.setJob("학생");
	    	  member9.setInvestOpt("위험추구");
	    	  member9.setSalary(4052);
	    	  member9.setProperty(3446);
	    	  member9.setProfile("나는야 파개미9");
	    	  log.info("preloading " + memberRepository.save(member9));
	    	  
	    	  Member member10 = new Member();
	    	  member10.setName("김수아");
	    	  member10.setUsername("koscom10");
	    	  member10.setPassword("1234");
	    	  member10.setGrade("LV.1 파개미");
	    	  member10.setAge(29);
	    	  member10.setJob("전문직");
	    	  member10.setInvestOpt("투자주식");
	    	  member10.setSalary(7767);
	    	  member10.setProperty(3384);
	    	  member10.setProfile("나는야 파개미10");
	    	  log.info("preloading " + memberRepository.save(member10));
			

	    	  Member member11 = new Member();
	    	  member11.setName("윤성수");
	    	  member11.setUsername("koscom11");
	    	  member11.setPassword("1234");
	    	  member11.setGrade("LV.2 초개미");
	    	  member11.setAge(34);
	    	  member11.setJob("자영업");
	    	  member11.setInvestOpt("투자주식");
	    	  member11.setSalary(7126);
	    	  member11.setProperty(5150);
	    	  member11.setProfile("나는야 초개미1");
	    	  log.info("preloading " + memberRepository.save(member11));

	    	  Member member12 = new Member();
	    	  member12.setName("박창재");
	    	  member12.setUsername("koscom12");
	    	  member12.setPassword("1234");
	    	  member12.setGrade("LV.2 초개미");
	    	  member12.setAge(32);
	    	  member12.setJob("전문직");
	    	  member12.setInvestOpt("위험추구");
	    	  member12.setSalary(7087);
	    	  member12.setProperty(7523);
	    	  member12.setProfile("나는야 초개미2");
	    	  log.info("preloading " + memberRepository.save(member12));

	    	  Member member13 = new Member();
	    	  member13.setName("박선영");
	    	  member13.setUsername("koscom13");
	    	  member13.setPassword("1234");
	    	  member13.setGrade("LV.2 초개미");
	    	  member13.setAge(30);
	    	  member13.setJob("서비스직");
	    	  member13.setInvestOpt("투자주식");
	    	  member13.setSalary(4870);
	    	  member13.setProperty(5614);
	    	  member13.setProfile("나는야 초개미3");
			  log.info("preloading " + memberRepository.save(member13));

	    	  Member member14 = new Member();
	    	  member14.setName("정유리");
	    	  member14.setUsername("koscom14");
	    	  member14.setPassword("1234");
	    	  member14.setGrade("LV.2 초개미");
	    	  member14.setAge(28);
	    	  member14.setJob("자영업");
	    	  member14.setInvestOpt("위험추구");
	    	  member14.setSalary(4740);
	    	  member14.setProperty(5510);
	    	  member14.setProfile("나는야 초개미4");
	    	  log.info("preloading " + memberRepository.save(member14));

	    	  Member member15 = new Member();
	    	  member15.setName("김동식");
	    	  member15.setUsername("koscom15");
	    	  member15.setPassword("1234");
	    	  member15.setGrade("LV.2 초개미");
	    	  member15.setAge(35);
	    	  member15.setJob("전문직");
	    	  member15.setInvestOpt("위험은조금만");
	    	  member15.setSalary(7545);
	    	  member15.setProperty(5115);
	    	  member15.setProfile("나는야 초개미5");
	    	  log.info("preloading " + memberRepository.save(member15));

	    	  Member member16 = new Member();
	    	  member16.setName("노민우");
	    	  member16.setUsername("koscom16");
	    	  member16.setPassword("1234");
	    	  member16.setGrade("LV.3 노개미");
	    	  member16.setAge(35);
	    	  member16.setJob("서비스직");
	    	  member16.setInvestOpt("단타위주");
	    	  member16.setSalary(3635);
	    	  member16.setProperty(8022);
	    	  member16.setProfile("나는야 노개미1");
	    	  log.info("preloading " + memberRepository.save(member16));

	    	  Member member17 = new Member();
	    	  member17.setName("장혜민");
	    	  member17.setUsername("koscom17");
	    	  member17.setPassword("1234");
	    	  member17.setGrade("LV.3 노개미");
	    	  member17.setAge(31);
	    	  member17.setJob("전문직");
	    	  member17.setInvestOpt("투자주식");
	    	  member17.setSalary(6574);
	    	  member17.setProperty(9186);
	    	  member17.setProfile("나는야 노개미2");
	    	  log.info("preloading " + memberRepository.save(member17));

	    	  Member member18 = new Member();
	    	  member18.setName("정규동");
	    	  member18.setUsername("koscom18");
	    	  member18.setPassword("1234");
	    	  member18.setGrade("LV.4 빨개미");
	    	  member18.setAge(32);
	    	  
	    	  
	    	  member18.setJob("서비스직");
	    	  member18.setInvestOpt("위험은조금만");
	    	  member18.setSalary(3750);
	    	  member18.setProperty(12507);
	    	  member18.setProfile("나는야 빨개미");
	    	  log.info("preloading " + memberRepository.save(member18));


	    	  // Stock
	    	  Stock stock1_1 = new Stock();
	    	  stock1_1.setBalanceNo("123456789");
	    	  stock1_1.setMember(member1);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock1_1.setFirmNm("NH투자증권");
	    	  stock1_1.setStockNm("삼성전자");
	    	  stock1_1.setQty(82);
	    	  stock1_1.setValTrade(40000);
	    	  stock1_1.setAssertType("주식");
	    	  log.info("Preloading " + stockRepository.save(stock1_1));
	    	  
	    	  Stock stock1_2 = new Stock();
	    	  stock1_1.setBalanceNo("123456789");
	    	  stock1_1.setMember(member1);
//	    	  stock1_1.setMemberId(member1.getId());
	    	  stock1_1.setFirmNm("NH투자증권");
	    	  stock1_1.setStockNm("현대자동차");
	    	  stock1_1.setQty(5);
	    	  stock1_1.setValTrade(90000);
	    	  stock1_1.setAssertType("주식");
	    	  log.info("Preloading " + stockRepository.save(stock1_2));
	    	  
	    	  Subscribe subscribe1_1 = new Subscribe();
	    	  subscribe1_1.setMember(member1);
	    	  subscribe1_1.setSubscriber_id(Long.valueOf(2));
	    	  log.info("Preloading " + subscribeRepository.save(subscribe1_1));
	    	  
	      };
	  }
}
