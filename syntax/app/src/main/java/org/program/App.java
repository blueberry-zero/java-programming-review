package org.program;

public class App {
	int age = 27;
	String name = "Dude";

    public static void main(String[] args) {
		App myApp = new App();
		System.out.println(String.format("Hello world! My name is %s and I am %s years old!", myApp.name, myApp.age));
    }
}
