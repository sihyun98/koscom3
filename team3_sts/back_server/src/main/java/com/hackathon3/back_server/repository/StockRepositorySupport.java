package com.hackathon3.back_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.hackathon3.back_server.domain.Member;
import com.hackathon3.back_server.domain.Stock;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.hackathon3.back_server.domain.QStock.stock;

@Repository
public class StockRepositorySupport extends QuerydslRepositorySupport {
	
	private final JPAQueryFactory queryFactory;
	
	public StockRepositorySupport(JPAQueryFactory queryFactory) {
		super(Stock.class);
		this.queryFactory = queryFactory;
	}
	
	public List<Stock> search(Member member){
		return queryFactory.selectFrom(stock)
				.where(stock.member.eq(member))
				.fetch();
	}

}
