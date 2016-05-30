package com.design.pattern;

import com.design.pattern.behavioral.command.CommandPatternDemo;
import com.design.pattern.structural.decorator.Circle;
import com.design.pattern.structural.decorator.RedShape;
import com.design.pattern.structural.decorator.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternExampleApplication {

	public static void main(String[] args) {


		SpringApplication.run(DesignPatternExampleApplication.class, args);

		CommandPatternDemo commandPatternDemo = new CommandPatternDemo();
		commandPatternDemo.main(args);


		Shape shapec = new Circle();
		Shape redDeco = new RedShape(new Circle());
		System.out.println("Normal circle");
		shapec.draw();

		redDeco.draw();
	}
}
