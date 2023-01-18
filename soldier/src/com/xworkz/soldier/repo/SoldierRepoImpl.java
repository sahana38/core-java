package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {


	public SoldierRepoImpl() {
		System.out.println("Created SoldireRepoImpl no-argument Constractor");
	}
	
	@Override
	public boolean save(SoldierDTO dto) {
		
		System.out.println("running save method");
		System.out.println("Dto"+ dto);
		return false;
	}

}
