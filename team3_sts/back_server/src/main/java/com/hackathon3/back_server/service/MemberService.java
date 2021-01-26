package com.hackathon3.back_server.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.hackathon3.back_server.dto.member.MemberDeleteResponseDto;
import com.hackathon3.back_server.dto.member.MemberSaveRequestDto;
import com.hackathon3.back_server.dto.member.MemberSaveResponseDto;
import com.hackathon3.back_server.dto.member.MemberSearchResponseDto;
import com.hackathon3.back_server.dto.member.MemberSigninRequestDto;
import com.hackathon3.back_server.dto.member.MemberSigninResponseDto;
import com.hackathon3.back_server.dto.member.MemberUpdateRequestDto;
import com.hackathon3.back_server.dto.member.MemberUpdateResponseDto;
import com.hackathon3.back_server.exception.MemberNotFoundException;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.repository.MemberRepositorySupport;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository repository;
	private final MemberRepositorySupport memberRepositorySupport;
	
	// POST - 회원가입
	@Transactional
	public MemberSaveResponseDto save(MemberSaveRequestDto requestDto) {
		
		// 같은 ID를 가진 사람이 있는지 체크
		Member findMember = memberRepositorySupport.existMember(requestDto.getUsername());
		
		if(findMember == null) {
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
	  	  	
	  	  	MemberSaveResponseDto dto = new MemberSaveResponseDto();
	  	  	dto.setCode("OK");
	  	  	dto.setMessage(String.valueOf(id));
	  	  	return dto;
		}
		else { // 회원가입 실패
			MemberSaveResponseDto dto = new MemberSaveResponseDto();
	  	  	dto.setCode("FAIL");
	  	  	dto.setMessage("새로운 username을 입력해 주세요.");
	  	  	return dto;
		}

	}
	
	// GET - 모든 회원 정보 가져오기
	@Transactional(readOnly = true)
	public List<MemberSearchResponseDto> search() {
		
		// 회원 정보를 저장할 배열
		List<MemberSearchResponseDto> memberSearchResponseDto = new ArrayList<MemberSearchResponseDto>();
		List<Member> members = repository.findAll();
		
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
			
			memberSearchResponseDto.add(dto);
			
		}
		
		return memberSearchResponseDto;
	}
	
	// GET - 로그인
	@Transactional
	public MemberSigninResponseDto signin(MemberSigninRequestDto requestDto) {

		// username과 password로 회원 조회
		Member member = memberRepositorySupport.searchMember(requestDto.getUsername(), requestDto.getPassword());
		MemberSigninResponseDto dto = new MemberSigninResponseDto();
		
		if(member == null) {
			dto.setCode("FAIL");
			dto.setMessage("일치하는 회원 정보가 없습니다.");
		}
		else {
			Long id = member.getId();
			
			dto.setCode("OK");
			dto.setMessage(String.valueOf(id));
		}
		
		return dto;
	}
	
	// UPDATE - 회원정보 수정
	@Transactional
    public MemberUpdateResponseDto update(Long id, MemberUpdateRequestDto requestDto){
        Member member = repository.findById(id).get();

		MemberUpdateResponseDto dto = new MemberUpdateResponseDto();

		if(member == null) {
			dto.setCode("FAIL");
			dto.setMessage("일치하는 회원 정보가 없습니다.");
		}
		else {
			member.setName(requestDto.getName());
//			member.setUsername(requestDto.getUsername());
			member.setPassword(requestDto.getPassword());
			member.setGrade(requestDto.getGrade());
			member.setAge(requestDto.getAge());
			member.setJob(requestDto.getJob());
			member.setInvestOpt(requestDto.getInvestOpt());
			member.setSalary(requestDto.getSalary());
			member.setProperty(requestDto.getProperty());
			member.setProfile(requestDto.getProfile());
			
			dto.setCode("OK");
			dto.setMessage(String.valueOf(id));
		}
		
		return dto;
    }
	
	// DELETE - 회원 탈퇴
	@Transactional
	public MemberDeleteResponseDto delete(Long id) {
		Member member = repository.findById(id).get();
		
		MemberDeleteResponseDto dto = new MemberDeleteResponseDto();
		
		if(member == null) {
			dto.setCode("FAIL");
			dto.setMessage("일치하는 회원 정보가 없습니다.");
		}
		else {
			repository.deleteById(id);
			
			dto.setCode("OK");
			dto.setMessage(String.valueOf(id));
		}
		
		return dto;
	}
}
