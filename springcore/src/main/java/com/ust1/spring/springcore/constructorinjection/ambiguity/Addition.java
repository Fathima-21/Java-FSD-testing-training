package com.ust1.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	Addition(int a, double b) {
		System.out.println("inside the constructor");
		System.out.println(a);
		System.out.println(b);
	} 
	
/*	Addition(double a,double b){
		System.out.println("inside constructor DOUBLE");
	}
	
	Addition(int a, int b) {
		System.out.println("inside constructor INT");
	}
	Addition(String a, String b) {
		System.out.println("inside constructor STRING");
	} */
}
