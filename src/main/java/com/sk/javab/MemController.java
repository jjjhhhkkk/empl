package com.sk.javab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.MemberDAO2;
import model.MemberDTO;

@Controller
public class MemController {
	@Autowired
	MemberDAO2 mdao;
	
	@RequestMapping("/memlist.do")
	public ModelAndView selectEmp(){
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> memlist = mdao.selectAll();
		
		mv.addObject("memlist", memlist);
		mv.setViewName("memberlist");
		return mv;
	}
	@RequestMapping("/memdetail.do")
	public String detailView(@RequestParam("mno") int mno, Model model){
		MemberDTO mem = mdao.selectById(mno);
		model.addAttribute("mem", mem);
		return "memberdetail";
	}
	@RequestMapping(value = "/fix.do",  method = RequestMethod.POST)
	public String fixView(int mno, Model model, MemberDTO mem){
		int count = mdao.updateEmp(mem);
		System.out.println(mem);
		if(count!=0)
			return "redirect:memlist.do"; //redirect
		else
			return "";
	}
	@RequestMapping(value = "/add.do",  method = RequestMethod.GET)
	public String insertView(Model model){
			return "memberinsert"; //redirect
	}
	@RequestMapping(value = "/add.do",  method = RequestMethod.POST)
	public String insertResult(Model model, MemberDTO mem){
		int count = mdao.insertEmp(mem);
		if(count!=0)
			return "redirect:memlist.do"; //redirect
		else
			return "";
	}
	
	@RequestMapping("/memdelete.do")
	public String deleteMember(int mno){
		int ret = mdao.deleteEmp(mno);
		
		return "redirect:memlist.do";
	}
	
	
}
