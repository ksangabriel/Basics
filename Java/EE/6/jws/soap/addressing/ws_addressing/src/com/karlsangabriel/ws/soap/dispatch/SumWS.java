package com.karlsangabriel.ws.soap.dispatch;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Action;
import javax.xml.ws.BindingType;
import javax.xml.ws.RespectBinding;
import javax.xml.ws.soap.Addressing;

@Addressing
@WebService
public class SumWS {

	
	@Action
	public int sum(int ... integers) {
		int sumTotal = 0;
		for(int i = 0; i < integers.length; i++) {
			sumTotal+=integers[i];
		}
		
		System.out.println(integers.length + " | " + sumTotal);
		return sumTotal;
	}
	
	@Action
	public int sum1(@WebParam(name="i") int i, @WebParam(name="j") int j) {
		return i + j;
	}
}
