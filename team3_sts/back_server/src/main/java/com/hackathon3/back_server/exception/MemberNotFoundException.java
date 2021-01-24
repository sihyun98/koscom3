package com.hackathon3.back_server.exception;

public class MemberNotFoundException extends RuntimeException {

	public MemberNotFoundException(Long id) {
	    super("Could not find member " + id);
	}
}
