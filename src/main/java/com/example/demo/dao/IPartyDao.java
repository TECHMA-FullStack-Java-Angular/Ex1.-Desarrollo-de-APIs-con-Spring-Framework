package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Party;

public interface IPartyDao extends JpaRepository<Party, Integer>{

}
