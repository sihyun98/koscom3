package com.hackathon3.back_server;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	private final MemberRepository repository;

	MemberController(MemberRepository repository) {
	    this.repository = repository;
	}
	
	// READ - all members
	@GetMapping("/api/members")
	List<Member> all() {
	    return repository.findAll();
	}
	
	// CREATE
	@PostMapping("/api/members")
	Member newMember(@RequestBody Member newMember) {
	    return repository.save(newMember);
	}

	// READ - one member
	@GetMapping("/api/members/{id}")
	Member one(@PathVariable Long id) {
	    return repository.findById(id)
	      .orElseThrow(() -> new MemberNotFoundException(id));
	}

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
