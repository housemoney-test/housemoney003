package com.example.housemoney2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.housemoney2.entity.FixedCost;
import com.example.housemoney2.mapper.FixedCostMapper;

@Service
public class FindFixedCostService {
    
    @Autowired
    private FixedCostMapper fixedCostMapper;
    
    @Transactional
    public FixedCost getFindById(int id) {
        return fixedCostMapper.findById(id);
    }

    @Transactional
	public FixedCost deleteById(int id) {
		return fixedCostMapper.deleteById(id);
	}
    
}