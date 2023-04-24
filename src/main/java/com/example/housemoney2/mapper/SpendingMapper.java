package com.example.housemoney2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.housemoney2.entity.Spending;

@Mapper
public interface SpendingMapper {

	List<Spending> findAll();

	int create(Spending entity);
	
	int edit(Spending entity);

	Spending findById(int id);
    
}