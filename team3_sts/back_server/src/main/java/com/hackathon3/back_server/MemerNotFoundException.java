package com.hackathon3.back_server;

class MemberNotFoundException extends RuntimeException {

	MemberNotFoundException(Long id) {
	    super("Could not find member " + id);
	}
}
