package com.hackathon3.back_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(MemberRepository repository) {

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
	    	log.info("Preloading " + repository.save(member1));
	    };
	  }
}
