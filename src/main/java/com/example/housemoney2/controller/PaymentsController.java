package com.example.housemoney2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.housemoney2.entity.FixedCost;
import com.example.housemoney2.entity.Spending;
import com.example.housemoney2.form.CreateSpendingForm;
import com.example.housemoney2.form.EditFixedCostForm;
import com.example.housemoney2.form.EditSpendingForm;
import com.example.housemoney2.service.FindFixedCostService;
import com.example.housemoney2.service.FindSpendingService;

@Controller
@RequestMapping("/payments")
public class PaymentsController {
	
	@Autowired
	private FindFixedCostService findFixedCostService;
	
	@Autowired
	private FindSpendingService findSpendingService;
	
	
	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("form", new CreateSpendingForm());
		return "payments/create";
	}
	
	@PostMapping("/create")
	public String create(BindingResult result,Model model) {
		return "payments/create";
	}
	
	@GetMapping("/fixed")
	public String fixed(@RequestParam int id, EditFixedCostForm editFixedCostForm, Model model) {
		//FixedCost型にgetFindByIdの戻り値を格納
	    FixedCost fixedCost = findFixedCostService.getFindById(id);
	    //fixedCost型にFixedCost型の情報を入れかえる
	    fixedCost.setId(fixedCost.getId());
	    fixedCost.setRentCosts(fixedCost.getRentCosts());
	    fixedCost.setUtilityCosts(fixedCost.getUtilityCosts());
	    fixedCost.setPhoneCosts(fixedCost.getPhoneCosts());
	    fixedCost.setOthers(fixedCost.getOthers());
        model.addAttribute("editFixedCostForm", fixedCost);
        model.addAttribute("form", new EditFixedCostForm());
		return "payments/fixed";
	}
	
	@PostMapping("/fixed")
	public String fixed(Model model) {
		return "payments/fixed";
	}
	
	@PostMapping("delete")
	public String delete(@RequestParam Integer id) {
		findFixedCostService.deleteById(id);
	    return "redirect:/payments/fixed";
	}
	
	@GetMapping("/income_edit")
	public String incomeEdit(Model model) {
		return "payments/income_edit";
	}
	
	@PostMapping("/income_edit")
	public String incomeEdit(BindingResult result,Model model) {
		return "payments/income_edit";
	}
	
	@GetMapping("/spending_edit")
	public String spendingEdit(@RequestParam int id, EditSpendingForm editSpendingForm, Model model) {
		//Spending型にgetFindByIdの戻り値を格納
	    Spending spending = findSpendingService.getFindById(id);
	    //spendingr型にSpending型の情報を入れかえる
	    spending.setId(spending.getId());
	    spending.setFoodCosts(spending.getFoodCosts());
	    spending.setLifeCosts(spending.getLifeCosts());
	    spending.setOthers(spending.getOthers());
        model.addAttribute("editFixedCostForm", spending);
		return "payments/spending_edit";
	}
	
	@PostMapping("/spending_edit")
	public String spendingEdit(Model model) {
		return "payments/spending_edit";
	}

}
