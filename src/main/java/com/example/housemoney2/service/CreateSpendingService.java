package com.example.housemoney2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.housemoney2.entity.Spending;
import com.example.housemoney2.form.CreateSpendingForm;
import com.example.housemoney2.mapper.SpendingMapper;

@Service
public class CreateSpendingService {

	@Autowired
	private SpendingMapper spendingMapper;

	@Transactional
	public int create(CreateSpendingForm form) {
		Spending entity = new Spending();
		entity.setFoodCosts(form.getFoodCosts());
		return spendingMapper.create(entity);
	}

}