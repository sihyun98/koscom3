package com.hackathon3.back_server.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberSigninRequestDto {

	private String username;
	private String password;
	
}
