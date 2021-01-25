package com.hackathon3.back_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.dto.member.MemberSaveRequestDto;
import com.hackathon3.back_server.dto.member.MemberSaveResponseDto;
import com.hackathon3.back_server.dto.member.MemberSearchResponseDto;
import com.hackathon3.back_server.dto.member.MemberSigninRequestDto;
import com.hackathon3.back_server.dto.member.MemberSigninResponseDto;
import com.hackathon3.back_server.exception.MemberNotFoundException;
import com.hackathon3.back_server.repository.MemberRepository;
import com.hackathon3.back_server.service.MemberService;

@RestController
public class MemberController {
	
	private final MemberRepository repository;
	
	private final MemberService memberService;

	MemberController(MemberRepository repository, MemberService memberService) {
	    this.repository = repository;
		this.memberService = memberService;
	}
	
	// GET
	@GetMapping("/api/member/search")
	List<MemberSearchResponseDto> search() {
		return memberService.search();
	}
//	List<Member> all() {
//	    return repository.findAll();
//	}
	
	// GET
	@PostMapping("/api/member/signin")
	public MemberSigninResponseDto signin(@RequestBody MemberSigninRequestDto requestDto) {
//		System.out.println(requestDto.getUsername());
		return memberService.signin(requestDto);
	}
	
	// CREATE
	@PostMapping("/api/member")
	public MemberSaveResponseDto save(@RequestBody MemberSaveRequestDto requestDto) {
		return memberService.save(requestDto);
	}
//	Member newMember(@RequestBody Member newMember) {
//	    return repository.save(newMember);
//	}

	// READ - one member
//	@GetMapping("/api/members/{id}")
//	MemberSearchResponseDto one(@PathVariable Long id) {
//		return repository.findById(id)
//				.orElseThrow(() -> new MemberNotFoundException(id));
//	}
	
//	Member one(@PathVariable Long id) {
//	    return repository.findById(id)
//	      .orElseThrow(() -> new MemberNotFoundException(id));
//	}

	// UPDATE - one member
	@PutMapping("/api/members/{id}")
	Member replaceMember(@RequestBody Member newMember, @PathVariable Long id) {

	    return repository.findById(id)
	      .map(member -> {
	    	  member.setName(newMember.getName());
	    	  member.setAge(newMember.getAge());
	        return repository.save(member);
	      })
	      .orElseGet(() -> {
	    	  newMember.setId(id);
	        return repository.save(newMember);
	      });
	}

	// DELETE - one member
	@DeleteMapping("/api/members/{id}")
	void deleteMember(@PathVariable Long id) {
	    repository.deleteById(id);
	}
}
