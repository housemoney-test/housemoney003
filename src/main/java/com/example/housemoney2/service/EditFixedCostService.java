//package com.example.housemoney2.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.example.housemoney2.entity.FixedCost;
//import com.example.housemoney2.form.EditFixedCostForm;
//import com.example.housemoney2.mapper.FixedCostMapper;
//
//@Service
//public class EditFixedCostService {
//
//    @Autowired
//    private FixedCostMapper fixedCostMapper;
//
//    @Transactional
//    public int edit(EditFixedCostForm editFixedCostForm) {
//        FixedCost fixedCost = new FixedCost();
//        fixedCost.setId(editFixedCostForm.getId());
//        fixedCost.setRentCosts(editFixedCostForm.getRentCosts());
//        fixedCost.setUtilityCosts(editFixedCostForm.getUtilityCosts());
//        fixedCost.setPhoneCosts(editFixedCostForm.getPhoneCosts());
//        fixedCost.setOthers(editFixedCostForm.getOthers());
//        return fixedCostMapper.edit(fixedCost);
//    }
//}