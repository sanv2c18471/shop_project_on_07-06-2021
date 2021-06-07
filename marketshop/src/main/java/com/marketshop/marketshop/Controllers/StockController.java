package com.marketshop.marketshop.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.marketshop.marketshop.Entities.Stock;
import com.marketshop.marketshop.Services.StockService;

@Controller
public class StockController {
	@Autowired
	private StockService stockService;

	@GetMapping("/home")
	public String viewHomePage(Model model) {
		List<Stock> liststock = stockService.listAll();
		model.addAttribute("liststock", liststock);
		// System.out.print("Get / ");
		return "index";
	}

	@GetMapping("/new") // add new button
	public String add(Model model) {
		model.addAttribute("stock", new Stock());
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST) // save button
	public String saveStock(@ModelAttribute("stock") Stock stock) {
		stockService.save(stock);
		return "redirect:/home";
	}

	@RequestMapping("/edit/{id}") // edit button
	public ModelAndView showEditStockPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("new");
		Stock stock = stockService.get(id);
		mav.addObject("stock", stock);
		return mav;

	}

	@RequestMapping("/delete/{id}") // delete button
	public String deletestock(@PathVariable(name = "id") int id) {
		stockService.delete(id);
		return "redirect:/home";
	}

	@GetMapping("/logout")
	public String loginPage() {
		return "welcome";
	}
	
	
}
