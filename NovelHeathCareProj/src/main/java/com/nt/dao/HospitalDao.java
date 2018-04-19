package com.nt.dao;

import java.util.List;

import com.nt.domain.Hospital;

public interface HospitalDao {

	public Hospital addHospital(Hospital hosp);
	public Hospital getHospitalById(int hospId);
	public boolean deleteHospital(int hospId);
	
	public List<Hospital>  searchAllHospitals(String hospname,String email, String city);
	
	public List<Hospital>  getAllHospitalsByPaging(int currPage,int noOfRecPage);
	
}
