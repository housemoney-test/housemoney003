package com.example.housemoney2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.housemoney2.entity.FixedCost;

@Mapper
public interface FixedCostMapper {

	List<FixedCost> findAll();

	int create(FixedCost entity);
	
	int edit(FixedCost entity);

	FixedCost findById(int id);

	FixedCost deleteById(int id);
    
}