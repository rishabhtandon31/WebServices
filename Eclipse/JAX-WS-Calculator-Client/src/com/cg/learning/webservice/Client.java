package com.cg.learning.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		URL url= new URL("http://localhost:9876/cs?wsdl");
		
		//Qualified name of the service:
		//1st argument is the service URI
		//2nd argument is the service name published in the WSDL
		QName qname= new QName("http://webservice.learning.cg.com/","CalculatorService");
		
		//Create, in effect, a factory for the service
		Service service= Service.create(url, qname);
		
		//Extract the endpoint interface, the service "port"
		CalculatorServer endPointIntf= service.getPort(CalculatorServer.class);
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 1st number for calculator operations");
		int number1=scanner.nextInt();
		System.out.println("Enter 2nd number for calculator operations");
		int number2=scanner.nextInt();
		System.out.println("Addition::\t"+endPointIntf.addition(number1, number2));
		System.out.println("Subtraction::\t"+endPointIntf.subtraction(number1, number2));
		System.out.println("Division::\t"+endPointIntf.division(number1, number2));
		System.out.println("Multiplication::\t"+endPointIntf.multiplication(number1, number2));
		System.out.println("Modulus::\t"+endPointIntf.modulus(number1, number2));
	}

}
