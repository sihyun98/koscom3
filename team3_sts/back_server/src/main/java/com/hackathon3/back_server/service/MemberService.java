package com.hackathon3.back_server.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.dto.member.MemberSearchResponseDto;
import com.hackathon3.back_server.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository repository;
	
//	MemberService(MemberRepository repository) {
//	    this.repository = repository;
//	}
	
	// GET
	@Transactional(readOnly = true)
	public List<MemberSearchResponseDto> search() {
//		List<Member> all() {
//	    return repository.findAll();
//	}
		
		List<MemberSearchResponseDto> memberSearchResponseDto = new ArrayList<MemberSearchResponseDto>();
		List<Member> members = repository.findAll();
		MemberSearchResponseDto dto = new MemberSearchResponseDto();
		
		System.out.println("member 개수" + memberSearchResponseDto.size());
		
		for(Member member : members) {
			
//			MemberSearchResponseDto dto = new MemberSearchResponseDto();
			dto.setId(member.getId());
			dto.setName(member.getName());
			dto.setGrade(member.getGrade());
			dto.setAge(member.getAge());
			dto.setJob(member.getJob());
			dto.setInvestOpt(member.getInvestOpt());
			dto.setSalary(member.getSalary());
			dto.setProperty(member.getProperty());
			dto.setProfile(member.getProfile());
			
//			dto.setStocks(member.getStocks());
			memberSearchResponseDto.add(dto);
			
		}
		
		return memberSearchResponseDto;
	}
}
