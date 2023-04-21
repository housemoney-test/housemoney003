package com.example.housemoney2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.housemoney2.entity.Spending;
import com.example.housemoney2.mapper.SpendingMapper;

@Service
public class FindSpendingService {
    
    @Autowired
    private SpendingMapper spendingMapper;
    
    @Transactional
    public Spending getFindById(int id) {
        return spendingMapper.findById(id);
    }
    
}