package com.hackathon3.back_server.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberSaveRequestDto {
	
	private Long id;
	private String name;
	private String username;
	private String password;
	private String grade;
	private int age;
	private String job;
	private String investOpt;
	private int salary;
	private int property;
	private String profile;

}
