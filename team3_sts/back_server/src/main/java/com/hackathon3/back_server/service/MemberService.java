package com.hackathon3.back_server.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.dto.member.MemberSaveRequestDto;
import com.hackathon3.back_server.dto.member.MemberSaveResponseDto;
import com.hackathon3.back_server.dto.member.MemberSearchResponseDto;
import com.hackathon3.back_server.dto.member.MemberSigninRequestDto;
import com.hackathon3.back_server.dto.member.MemberSigninResponseDto;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.MemberRepositorySupport;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository repository;
	private final MemberRepositorySupport memberRepositorySupport;
	
//	MemberService(MemberRepository repository) {
//	    this.repository = repository;
//	}
	
	// POST
	@Transactional
	public MemberSaveResponseDto save(MemberSaveRequestDto requestDto) {
		
//		Member findMember = repository.findById(requestDto.getId());
		
		Member member = new Member();
  	  	member.setName(requestDto.getName());
  	  	member.setUsername(requestDto.getUsername());
  	  	member.setPassword(requestDto.getPassword());
  	  	member.setGrade(requestDto.getGrade());
  	  	member.setAge(requestDto.getAge());
  	  	member.setJob(requestDto.getJob());
  	  	member.setInvestOpt(requestDto.getInvestOpt());
  	  	member.setSalary(requestDto.getSalary());
  	  	member.setProperty(requestDto.getProperty());
  	  	member.setProfile(requestDto.getProfile());

  	  	Long id = repository.save(member).getId();
  	  
//  	  	repository.save(member);
  	  	
  	  	MemberSaveResponseDto dto = new MemberSaveResponseDto();
  	  	dto.setCode("OK");
  	  	dto.setMessage(String.valueOf(id));
  	  	return dto;
//        return AccountSaveResponseDto.builder()
//                .code("OK")
//                .message(String.valueOf(id))
//                .build();
	}
	
	// GET
	@Transactional(readOnly = true)
	public List<MemberSearchResponseDto> search() {
//		List<Member> all() {
//	    return repository.findAll();
//	}
		
		List<MemberSearchResponseDto> memberSearchResponseDto = new ArrayList<MemberSearchResponseDto>();
		List<Member> members = repository.findAll();
//		MemberSearchResponseDto dto = new MemberSearchResponseDto();
		
//		System.out.println("member 개수" + members.size());

//		System.out.println(members.get(0).getProfile());
//		System.out.println(members.get(1).getProfile());

//		System.out.println("member 개수" + memberSearchResponseDto.size());
		
		for(Member member : members) {
			
			MemberSearchResponseDto dto = new MemberSearchResponseDto();
			dto.setId(member.getId());
			dto.setName(member.getName());
			dto.setUsername(member.getUsername());
			dto.setPassword(member.getPassword());
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
	
	// GET
	@Transactional
	public MemberSigninResponseDto signin(MemberSigninRequestDto requestDto) {

		Member member = memberRepositorySupport.searchMember(requestDto.getUsername(), requestDto.getPassword());
		MemberSigninResponseDto dto = new MemberSigninResponseDto();
		
		if(member == null) {
			
			dto.setCode("FAIL");
			dto.setMessage(String.valueOf(0));
			
		}
		else {
			Long id = member.getId();
			
			dto.setCode("OK");
			dto.setMessage(String.valueOf(id));
			
		}
		
		return dto;
	}
}
