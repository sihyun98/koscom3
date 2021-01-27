package com.hackathon3.back_server.dto.stock;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class StockSearchResponseDto {
	
	private Long id;
	private String balanceNo;		
	private String firmNm;
	private String stockNm;
	private int qty;
	private int valTrade;
	private double earningRate;
	private String assertType;

}
