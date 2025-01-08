package com.example.demo1;

import java.util.Random;

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
		
		Calculator calculator = (int x, int y) -> {
			Random random = new Random();
			int randomNumber = random.nextInt();
			return x*y + randomNumber;
		};
		System.out.println(calculator.calculate(1, 2));
	}
}
