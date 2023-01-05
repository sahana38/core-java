package com.xworkz.collection;
	
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.stream.Collectors;


	public class ApplicationRunner {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Collection<ApplicationDTO> collection = new ArrayList<ApplicationDTO>();
			collection.addAll((Collection<? extends ApplicationDTO>) new ApplicationsDTO("Google drive",68.0,true,"Google",250));
			collection.addAll((Collection<? extends ApplicationDTO>) new ApplicationsDTO("Microsoft Bing",7,false,"Mircosoft",650));
			collection.addAll((Collection<? extends ApplicationDTO>) new ApplicationsDTO("Google assistant",11,true,"Google",0));
			collection.addAll((Collection<? extends ApplicationDTO>) new ApplicationsDTO("Instagram",70,true,"Meta",0));
			
			collection.stream().filter(ele->ele.isFree()!=false || ele.getDevelopedBy()=="Google" || ele.getVersion()>5)
			.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
			
			System.out.println(System.lineSeparator());
			System.out.println("=====================================================");
			collection.stream().collect(Collectors.toSet()).forEach(dto->System.out.println(dto.getName()));
				
		}

	}
