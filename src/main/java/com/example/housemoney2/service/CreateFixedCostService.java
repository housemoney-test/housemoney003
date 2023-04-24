package com.example.housemoney2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.housemoney2.entity.FixedCost;
import com.example.housemoney2.form.CreateFixedCostForm;
import com.example.housemoney2.mapper.FixedCostMapper;

@Service
public class CreateFixedCostService {

	@Autowired
	private FixedCostMapper fixedCostMapper;

	@Transactional
	public int create(CreateFixedCostForm form) {
		FixedCost entity = new FixedCost();
		entity.setRentCosts(form.getRentCosts());
		entity.setUtilityCosts(form.getUtilityCosts());
		entity.setPhoneCosts(form.getPhoneCosts());
		entity.setOthers(form.getOthers());
		return fixedCostMapper.create(entity);
	}

}