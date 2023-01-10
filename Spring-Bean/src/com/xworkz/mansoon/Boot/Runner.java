package com.xworkz.mansoon.Boot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mansoon.Bean.Actor;
import com.xworkz.mansoon.Bean.Bun;
import com.xworkz.mansoon.Bean.Flower;
import com.xworkz.mansoon.Bean.Puff;
import com.xworkz.mansoon.Bean.Rocket;
import com.xworkz.mansoon.Bean.Season;
import com.xworkz.mansoon.Config.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
	ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Flower ref = spring.getBean(Flower.class);
	System.out.println(ref);
	
	
	Puff ref1 = spring.getBean(Puff.class);
	System.out.println(ref1);
	
	
	Bun ref2 = spring.getBean(Bun.class);
	System.out.println(ref2);
	
	
	Rocket ref31=spring.getBean(Rocket.class);
	System.out.println(ref31);
	System.out.println(ref31.getName());
	System.out.println(ref31.getCountry());
	System.out.println(ref31.getBudget());
	
	/*Rocket ref32=spring.getBean("rock1",Rocket.class);
	System.out.println(ref32);
	
	Rocket ref33=spring.getBean("rock2", Rocket.class);
	System.out.println(ref33);
	
	Rocket ref34=spring.getBean("rock3" ,Rocket.class);
	System.out.println(ref34);
	
	Rocket ref35=spring.getBean("rock4",Rocket.class);
	System.out.println(ref35);
	
	Rocket ref36=spring.getBean("rock5",Rocket.class);
	System.out.println(ref36);
	
	
	Rocket ref37=spring.getBean("rock6",Rocket.class);
	System.out.println(ref37);*/

	System.out.println("**************************************");
	
	
	/*Actor ref4 = spring.getBean("actor", Actor.class);*
	System.out.println(ref4);
	System.out.println(ref4.getName());
	System.out.println(ref4.getLanguage());*/
	
	Actor ref41 = spring.getBean("name1",Actor.class);
	System.out.println(ref41);
	System.out.println(ref41.getName());
	System.out.println(ref41.getLanguage());
	
	Actor ref42 = spring.getBean("name2",Actor.class);
	System.out.println(ref42);
	System.out.println(ref42.getName());
	System.out.println(ref42.getLanguage());
	
	Actor ref43 = spring.getBean("name3",Actor.class);
	System.out.println(ref43);
	System.out.println(ref43.getName());
	System.out.println(ref43.getLanguage());
	
	Actor ref44 = spring.getBean("name4",Actor.class);
	System.out.println(ref44);
	System.out.println(ref44.getName());
	System.out.println(ref44.getLanguage());
	
	Actor ref45 = spring.getBean("name5",Actor.class);
	System.out.println(ref45);
	System.out.println(ref45.getName());
	System.out.println(ref45.getLanguage());
	
	Actor ref46 = spring.getBean("name6",Actor.class);
	System.out.println(ref46);
	System.out.println(ref46.getName());
	System.out.println(ref46.getLanguage());
	
	
	System.out.println("********************************************************");
	
	/*Season ref5 = spring.getBean(Season.class);
	System.out.println(ref5);
	*/
	
	Season ref5 = spring.getBean("type",Season.class);
	System.out.println(ref5);
	System.out.println(ref5.getName());
	System.out.println(ref5.getDuration());
	System.out.println(ref5.getStartingMonth());

	Season ref51 = spring.getBean("type1",Season.class);
	System.out.println(ref51);
	System.out.println(ref51.getName());
	System.out.println(ref51.getDuration());
	System.out.println(ref51.getStartingMonth());
	
	
	
	Season ref52 = spring.getBean("type2",Season.class);
	System.out.println(ref52);
	System.out.println(ref52);
	System.out.println(ref52.getName());
	System.out.println(ref52.getDuration());
	System.out.println(ref52.getStartingMonth());
	
	Season ref53 = spring.getBean("type3",Season.class);
	System.out.println(ref53);
	System.out.println(ref53);
	System.out.println(ref53.getName());
	System.out.println(ref53.getDuration());
	System.out.println(ref53.getStartingMonth());
	
	Season ref54 = spring.getBean("type4",Season.class);
	System.out.println(ref54);
	System.out.println(ref54);
	System.out.println(ref54.getName());
	System.out.println(ref54.getDuration());
	System.out.println(ref54.getStartingMonth());
	
	Season ref55 = spring.getBean("type5",Season.class);
	System.out.println(ref55);
	System.out.println(ref55);
	System.out.println(ref55.getName());
	System.out.println(ref55.getDuration());
	System.out.println(ref55.getStartingMonth());
	
	}
}
