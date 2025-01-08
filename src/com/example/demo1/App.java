package com.example.demo1;

public class App {
	public static void main(String[] args) {
		Greeting greet = new Hello();
		greet.sayHello();
		
		Greeting greet2 = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Anonymus sayHello method called");
			}
		};
		greet2.sayHello();
		
		Greeting greet3 = () -> System.out.println("Lambda Expression");
		greet3.sayHello();
		
	}
}
