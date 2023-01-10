package com.xworkz.mansoon.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mansoon.Bean.Actor;
import com.xworkz.mansoon.Bean.Bun;
import com.xworkz.mansoon.Bean.Flower;
import com.xworkz.mansoon.Bean.Puff;
import com.xworkz.mansoon.Bean.Rocket;
import com.xworkz.mansoon.Bean.Season;

@Configuration
@ComponentScan("com.xworkz.monsoon")
public class SpringConfiguration {
	
	@Bean
	public Flower rose() {
		System.out.println("Registered rose with String");
		Flower flower = new  Flower();
		return flower;
	}
	
	@Bean
	public Puff eggPuff() {
		System.out.println("Registering eggPuff with string ");
		Puff puff = new Puff("NON veg", "eggPuff");
		return puff;
	}
	
	@Bean
	public Bun sweetBun() {
		System.out.println("registered sweetBun with spring");
		Bun b = new Bun();
		b.setBakeryName("Swati");
		b.setPrice(30);
		return b;
	}
	
	///Literals
	@Bean
	public Rocket rock1() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}
	
	/*@Bean
	public Rocket rock1() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}
	
	@Bean
	public Rocket rock2() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}
	
	@Bean
	public Rocket rock3() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}
	
	@Bean
	public Rocket rock4() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}
	
	@Bean
	public Rocket rock5() {
		System.out.println("Registering rocket with spring");
		Rocket rock=new Rocket();
		return rock;	
	}*/
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//constructor
	@Bean
	public Actor name1() {
		System.out.println("registering Actor with spring");
		Actor act = new Actor("Darshan", "kannada");
		return act;
	}
	
	@Bean
	public Actor name2() {
		System.out.println("registering Actor with spring");
		Actor act1 = new Actor("sudeep", "kannada");
		return act1;
	}
	
	@Bean
	public Actor name3() {
		System.out.println("registering Actor with spring");
		Actor act2 = new Actor("prajwal", "kannada");
		return act2;
	}
	
	@Bean
	public Actor name4() {
		System.out.println("registering Actor with spring");
		Actor act3 = new Actor("ajay", "kannada");
		return act3;
	}
	
	@Bean
	public Actor name5() {
		System.out.println("registering Actor with spring");
		Actor act4 = new Actor("rakshit", "kannada");
		return act4;
	}
	
	@Bean
	public Actor name6() {
		System.out.println("registering Actor with spring");
		Actor act5 = new Actor("rakshit", "kannada");
		return act5;
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//getter and setter
	@Bean
	public Season type() {
		System.out.println("registering season with spring");
		Season s = new Season();
		s.setName("rainy");
		s.setDuration(6);	
		s.setStartingMonth("Oct");
		return s;
	}
	
	@Bean
	public Season type1() {
		System.out.println("registering season with spring");
		Season s1 = new Season();
		s1.setName("summer");
		s1.setDuration(3);	
		s1.setStartingMonth("may");
		return s1;
	}
	
	@Bean
	public Season type2() {
		System.out.println("registering season with spring");
		Season s2 = new Season();
		s2.setName("winter");
		s2.setDuration(4);	
		s2.setStartingMonth("april");
		return s2;
	}
	
	@Bean
	public Season type3() {
		System.out.println("registering season with spring");
		Season s3 = new Season();
		s3.setName("heavy rainy");
		s3.setDuration(6);	
		s3.setStartingMonth("Oct");
		return s3;
	}
	
	@Bean
	public Season type4() {
		System.out.println("registering season with spring");
		Season s4 = new Season();
		s4.setName("heavy summer");
		s4.setDuration(6);	
		s4.setStartingMonth("june");
		return s4;
	}
	
	@Bean
	public Season type5() {
		System.out.println("registering season with spring");
		Season s5 = new Season();
		s5.setName("mid winter");
		s5.setDuration(6);	
		s5.setStartingMonth("jan");
		return s5;
	}

}
