package com.peticom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.peticom.dao.CustomersRepo;
import com.peticom.model.Customers;

import java.lang.reflect.Array;
import java.time.Clock;
import java.util.List;

@Controller
public class HomeController{
	
	@Autowired
	CustomersRepo repo;


	@RequestMapping ("/home")
	public String home() {

		System.out.println("home");
		
		return "home.jsp";
	}

	@RequestMapping("/updateCustomers")
	public ModelAndView saveOrUpdateCustomers(Customers customers) {
		ModelAndView mv = new ModelAndView("showCustomers.jsp");
		repo.save(customers);
		return mv;
	}
	
	@RequestMapping("/getCustomers")
	public ModelAndView getCustomers(@RequestParam int custid)
	{
		ModelAndView mv= new ModelAndView("showCustomers.jsp");
		Customers customers = repo.findById(custid).orElse(new Customers());
		mv.addObject(customers);
		return mv;
	}

	@RequestMapping("/delCustomers")
	public ModelAndView delCustomers(@RequestParam int custid)
	{
		ModelAndView mv= new ModelAndView("showCustomers.jsp");
		Customers customers = repo.findById(custid).orElse(new Customers());
		repo.delete(customers);
		mv.addObject(customers);
		return mv;
	}

	/*@RequestMapping("/listCustomers")
	public List<Customers> getAllCustomers(){
		return;
	}*/

	@RequestMapping("/listCustomers")
	public ModelAndView listCustomers() {
		ModelAndView mv = new ModelAndView("List.jsp");
		//customers = repo.findAll();
		System.out.println("/listCustomersnél vagyok!");
		repo.findAll();
		mv.addObject(repo.findAll());
		return mv;

	}


	
}
