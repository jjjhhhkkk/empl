package com.sk.javab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController2 {
	@RequestMapping("/my2")
	public ModelAndView selectAll(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("name","½ÉÈÆ");
		mv.addObject("subject","ÄÄ°ø");
		Product p = new Product();
		p.setName("galaxy s7");
		p.setPrice(50);
		mv.addObject("myproduct",p);
		mv.setViewName("myintro");
		return mv;
	}
}
