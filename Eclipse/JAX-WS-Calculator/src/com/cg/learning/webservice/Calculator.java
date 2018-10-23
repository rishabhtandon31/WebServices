package com.cg.learning.webservice;
import javax.jws.WebService;

@WebService(endpointInterface="com.cg.learning.webservice.CalculatorServer")
public class Calculator implements CalculatorServer{
	public int addition(int param1, int param2) {
		return param1+param2;
	}

	public int subtraction(int param1, int param2) {
		return param1-param2;
	}

	public int multiplication(int param1, int param2) {
		return param1*param2;
	}

	public int division(int param1, int param2) {
		return param1/param2;
	}

	public int modulus(int param1, int param2) {
		return param1%param2;
	}
	
}
