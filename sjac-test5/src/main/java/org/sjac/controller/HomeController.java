package org.sjac.controller;

import java.util.List;

import javax.annotation.Resource;

import org.sjac.model.GroupService;
import org.sjac.model.GroupVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Resource
	private GroupService groupService; 
	
	@RequestMapping("home.do")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView();
		List<GroupVO> list = groupService.getAllGroupList();
		System.out.println(list);
		mv.setViewName("home");
		mv.addObject("groupList", list);
		return mv;
	}
}
