package com.sk.javab;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.DeptVO;
import model.EmpDTO;
import model.EmployeeService;
import model.EmployeeVO;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service2;
	
	@RequestMapping("/emplist.do")
	public ModelAndView selectEmp(){
		ModelAndView mv = new ModelAndView();
		ArrayList<EmployeeVO> emplist = service2.selectAll();
		
		System.out.println(emplist.size()+"건");
		mv.addObject("emplist", emplist);
		mv.setViewName("emplist");
		return mv;
	}

	@RequestMapping("/detail.do")
	public String detailView(@RequestParam("empid") int empid, Model model){
		EmployeeVO emp = service2.selectByID(empid);
		model.addAttribute("emp", emp);
		return "detailView";
	}
	
	@RequestMapping(value = "/empinsert.do", method = RequestMethod.GET)
	public String insert( Model model){
		java.util.List<String> jobs = service2.selectJobs();
		java.util.List<DeptVO> deptlist = service2.selectDepts();
		model.addAttribute("jobs", jobs);
		model.addAttribute("deptlist", deptlist);
		return "empInsert"; //forward
	}
		

	
	@RequestMapping(value = "/empinsert.do", method = RequestMethod.POST)
	public String insertPost( Model model, EmpDTO emp){
		//폼창에서 회원정보를 입력받은 후 저장하면 리스트로 뿌려춘다.
		int count = service2.insertEmp(emp);
		System.out.println(emp);
		if(count!=0)
			return "redirect:emplist.do"; //redirect
		else
			return "";
	}
	
	@RequestMapping(value = "/empfix.do", method = RequestMethod.POST)
	public String fixPost( Model model, EmpDTO emp){
		//폼창에서 회원정보를 입력받은 후 저장하면 리스트로 뿌려춘다.
		int count = service2.updateEmp(emp);
		if(count!=0)
			return "redirect:emplist.do"; //redirect
		else
			return "";
	}
	
	@RequestMapping("/memdelete2.do")
	public String deleteMember(int employee_id){
		int ret = service2.deleteEmp(employee_id);
		return "redirect:emplist.do";
	}
	


}
