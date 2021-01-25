package com.hackathon3.back_server.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberSigninResponseDto {
	
	private String code;
	private String message;

}
