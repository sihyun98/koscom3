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
import com.hackathon3.back_server.service.MemberService;

@RestController
public class MemberController {
	
	private final MemberRepository repository;
	
	private final MemberService memberService;

	MemberController(MemberRepository repository, MemberService memberService) {
	    this.repository = repository;
		this.memberService = memberService;
	}
	
	// SEARCH
	@GetMapping("/api/member/search")
	public List<MemberSearchResponseDto> search() {
		return memberService.search();
	}
	
	// SIGNIN
	@PostMapping("/api/member/signin")
	public MemberSigninResponseDto signin(@RequestBody MemberSigninRequestDto requestDto) {
		return memberService.signin(requestDto);
	}
	
	// CREATE
	@PostMapping("/api/member")
	public MemberSaveResponseDto save(@RequestBody MemberSaveRequestDto requestDto) {
		return memberService.save(requestDto);
	}

	// UPDATE
	@PutMapping("/api/member/{id}")
    public MemberUpdateResponseDto update(@PathVariable Long id, @RequestBody MemberUpdateRequestDto requestDto){
        return memberService.update(id,requestDto);
    }
	

	// DELETE - one member
	@DeleteMapping("/api/member/{id}")
	public MemberDeleteResponseDto delete(@PathVariable Long id) {
	    return memberService.delete(id);
	}
}
