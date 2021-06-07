package com.marketshop.marketshop.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketshop.marketshop.Entities.Billing;
import com.marketshop.marketshop.Entities.Stock;
import com.marketshop.marketshop.Services.BillingService;
@Controller
public class BillingController {
@Autowired
private BillingService billingService;

@RequestMapping(value = "/bill", method = RequestMethod.GET)
   public String index() 
    {
      return "total";
   }

@GetMapping("/logoutpage")
public String logout()
{
	
	return "welcome";
}



	/*@GetMapping("/bill")
	public String billPage(Model model) {
		List<Billing> listbilling = billingService.listAll();
		model.addAttribute("listbilling", listbilling);
		return "employeebilling";
	}

	
	
	
	@GetMapping("/customerstocklist")
	public String addStockList(Model model) {
		model.addAttribute("billing", new Billing());
		return "employeestock";
		}
	
	@RequestMapping(value = "/savecuslist", method = RequestMethod.POST) // save button
	public String saveCustomerStock(@ModelAttribute("billing") Billing billing) {
		billingService.save(billing);
		return "redirect:/bill";
	}
	
	
	@RequestMapping("/deletebilling/{id}") // delete button
	public String deletebilling(@PathVariable(name = "id") long id) {
		billingService.delete(id);
		return "redirect:/bill";
	}*/
}
