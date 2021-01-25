package com.hackathon3.back_server.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.hackathon3.back_server.domain.Member;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.hackathon3.back_server.domain.QMember.member;

@Repository
public class MemberRepositorySupport extends QuerydslRepositorySupport {

	private final JPAQueryFactory queryFactory;
	
	public MemberRepositorySupport(JPAQueryFactory queryFactory) {
		super(Member.class);
		this.queryFactory = queryFactory;
	}
	
	public Member searchMember(String username, String password) {
//		System.out.printf(username);
//		System.out.printf(password);
		return queryFactory.selectFrom(member)
				.where(memberUsernameEq(username))
				.where(memberPasswordEq(password))
				.fetchOne();
	}
	
	public BooleanExpression memberUsernameEq(String username) {
		return username == null ? null : member.username.eq(username);
	}
	
	public BooleanExpression memberPasswordEq(String password) {
		return password == null ? null : member.password.eq(password);
	}
}
