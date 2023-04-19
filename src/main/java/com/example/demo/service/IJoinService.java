package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Join;



public interface IJoinService {
	
	//Basic CRUD methods
	
	public List<Join> showJoin(); //get All 
	
	public Join createJoin(Join join);	//CREATE 
	
	public Join findJoin(int id); // READ
	
	public Join updateJoin(Join join); // UPDATE
	
	public void deleteJoin(int id);//  DELETE

}
