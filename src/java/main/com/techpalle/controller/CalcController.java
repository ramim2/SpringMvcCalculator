package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
	@RequestMapping(value="calc",params="btnAdd")
public ModelAndView getAdd(String tbFn,String tbSn) {
	ModelAndView mv= new ModelAndView();
	//convert the String to Integer 
	int fn=Integer.parseInt(tbFn);
	int sn=Integer.parseInt(tbSn);
	//Add the above two number and store it in a variable
	int res=fn+sn;
	
	
	
	//put the result in Mobileandview
	mv.addObject("result",res);
	
	//redirect user to display.jsp
	mv.setViewName("display.jsp");
	
	return mv;
}
	
	@RequestMapping(value="calc",params="btnSub")
	public ModelAndView getSub(String tbFn,String tbSn) {
		ModelAndView mv= new ModelAndView();
		//convert the String to Integer 
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		//Add the above two number and store it in a variable
		int res=fn-sn;
		
		
		
		//put the result in Mobileandview
		mv.addObject("result",res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
}
	@RequestMapping(value="calc",params="btnMul")
	public ModelAndView getMul(String tbFn,String tbSn) {
		ModelAndView mv= new ModelAndView();
		//convert the String to Integer 
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		//Add the above two number and store it in a variable
		int res=fn*sn;
		
		
		
		//put the result in Mobileandview
		mv.addObject("result",res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	
}
	@RequestMapping(value="calc",params="btnDiv")
	public ModelAndView getDiv(String tbFn,String tbSn) {
		ModelAndView mv= new ModelAndView();
		//convert the String to Integer 
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		//Add the above two number and store it in a variable
		float res=fn/sn;
		
		
		
		//put the result in Mobileandview
		mv.addObject("result",res);
		
		//redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
}
}
