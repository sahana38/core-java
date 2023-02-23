package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroPlaneEntity;

public interface Aerorepositary {

	boolean saving(AeroPlaneEntity aeroPlaneEntity);
	
	default AeroPlaneEntity findBy(int id)
	{
		return null;
		
	}
}