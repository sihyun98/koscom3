package com.hackathon3.back_server.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/test")
	public TestResponseDto test() {
		
		TestResponseDto dto = new TestResponseDto();
		dto.setCode("OK");
		dto.setMessage("sts�׽�Ʈ����!");
		return dto;
		
//		return TestResponseDto.builder()
//				.code("OK")
//				.message("sts�׽�Ʈ����!")
//				.build();
	}
}
