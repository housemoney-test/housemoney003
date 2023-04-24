package com.example.housemoney2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.housemoney2.entity.Spending;
import com.example.housemoney2.form.EditSpendingForm;
import com.example.housemoney2.mapper.SpendingMapper;

@Service
public class EditSpendingService {

    @Autowired
    private SpendingMapper spendingMapper;

    @Transactional
    public int edit(EditSpendingForm editSpendingtForm) {
        Spending spending = new Spending();
        spending.setId(editSpendingtForm.getId());
        spending.setFoodCosts(editSpendingtForm.getFoodCosts());
        spending.setLifeCosts(editSpendingtForm.getLifeCosts());
        spending.setOthers(editSpendingtForm.getOthers());
        return spendingMapper.edit(spending);
    }
}