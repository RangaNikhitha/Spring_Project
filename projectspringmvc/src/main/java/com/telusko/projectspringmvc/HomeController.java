package com.telusko.projectspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.projectspringmvc.model.Alien;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	// ModelAttribute at Method level ===>We can set data in the model before a handler method executes
	//It will executes first. By using this at the method level, we can also set global data for our web-app
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","alien");
	}
	
	@RequestMapping("/")
	public String home() {
		//System.out.println("hi");
		return "index";
	}
	
	// Using HttpServletRequest ===>For accepting the data 
	//HttpSession object ===>We want session because to add data in to the session object it will send data to the jsp
	
/*	@RequestMapping("add")
	public String add(HttpServletRequest req) {
	    int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2")); 
		
		int num3=i+j;
		HttpSession session=req.getSession();
		session.setAttribute("num3",num3);
		return "result.jsp";
	}*/
	
	// using RequestParam===> It is used to form data and bind it automatically to the parameter present in the provided method.
	//HttpSession object
	
/*	@RequestMapping("add")
	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j, HttpSession session) {
		
		int num3=i+j;
		session.setAttribute("num3",num3);
		return "result.jsp";
	}*/
	
	// Using ModelAndView ===>It makes controller to return model and view in a single return value.
	
/*	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		
		int num3=i+j;
		mv.addObject("num3", num3);
		
		return mv;
	}*/
	
	// Using Model and ModelMap ===>Instead of using ModelAndView we can use model and model map 
	// Model and Model Map returns the jsp page.
	// If we want to use simple object we go for "Model" . If we want in map format we go for "ModelMap"
	
/*	@RequestMapping("add")
	public String add(@RequestParam("num1")int i, @RequestParam("num2") int j, ModelMap m) {
		int num3=i+j;
		m.addAttribute("num3", num3);
		return "result";
	}*/
	
/*	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, Model m) {
		
		Alien a=new Alien();
		a.setAid(aid);
		a.setAname(aname);
		
		m.addAttribute("alien",a);
		return "result";
	}*/
	
	//Instead of using RequestParam we can call directly Alien object. when we pass the values like aid,aname names are same then it will be assigned automatically to the Alien object 
	// we can do this by Using ModelAttribute
	// here what ever the request is coming from client will be assigned to 'a'
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		return "result";
	}
	

}
