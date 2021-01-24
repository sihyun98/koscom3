package com.hackathon3.back_server.dto.member;

import java.util.ArrayList;
import java.util.List;

import com.hackathon3.back_server.domain.Stock;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberSearchResponseDto {
	
	private Long id;
	private String name;
	private String grade;
	private int age;
	private String job;
	private String investOpt;
	private int salary;
	private int property;
	private String profile;
//	private List<Stock> stocks = new ArrayList<>();

}
