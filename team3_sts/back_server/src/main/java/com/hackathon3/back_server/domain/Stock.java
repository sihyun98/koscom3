package com.hackathon3.back_server.domain;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Stock {
	
	private @Id @GeneratedValue @Column(name = "stock_id") Long id;
	private String balanceNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")	
	private Member member;
	
//	private Long memberId;
	
	private String firmNm;
	private String stockNm;
	private int qty;
	private int valTrade;
	private double earningRate;
	private String assertType;
	
	@Override
	public String toString() {
	    return "Stock{" + "id=" + this.id + ", memberId='" + this.member.getId() + ", balanceNo='" + this.balanceNo + '\''
	    		+ ", firmNm='" + this.firmNm + '\'' + ", stockNm='" + this.stockNm + '\'' 
	    		+ ", qty='" + this.qty + '\'' + ", valTrade='" + this.valTrade + '\''
	    		+ ", earningRate='" + this.earningRate + '\'' + ", earningRate='" + this.earningRate + '\'' 
	    		+ ", assertType='" + this.assertType + '}';
	}

}
