package com.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
/*	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{	
		HttpSession session=req.getSession();
		String name=req.getParameter("name"); //fetching
		System.out.println("hi"+name);
		session.setAttribute("name", name);
		return "home";
	}

}*/
	
	// model and view
	
/*	@RequestMapping("home")
	public ModelAndView name(@RequestParam("name") String myName)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
		
		return mv;
	} */
	
	// Model Object
	
	@RequestMapping("home")
	public ModelAndView name(Product product)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", product);
		mv.setViewName("home");
	
		return mv;
		
	}
}