package com.xworkz.aeroplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplane.dto.AeroPlaneDTO;

public interface AeroPlaneService {

	Set<ConstraintViolation<AeroPlaneDTO>> validateAndSave(AeroPlaneDTO aeroPlaneDTO);
	
	default AeroPlaneDTO findById(int id)
	{
		return null;
	}	
	}