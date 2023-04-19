package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IJoinDao;
import com.example.demo.dto.Join;

@Service
public class JoinServiceImpl implements IJoinService{
	
	@Autowired
	IJoinDao iJoin;

	@Override
	public List<Join> showJoin() {
		
		return iJoin.findAll();
	}

	@Override
	public Join createJoin(Join join) {
		
		return iJoin.save(join);
	}

	@Override
	public void deleteJoin(int id) {
		iJoin.deleteById(id);
		
	}

}
