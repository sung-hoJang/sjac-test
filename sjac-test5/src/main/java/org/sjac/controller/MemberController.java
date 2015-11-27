package org.sjac.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sjac.model.MemberService;
import org.sjac.model.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@Resource
	private MemberService memberService;

	@RequestMapping("signup.do")
	public String signup() {
		return "signup";
	}

	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public ModelAndView login(MemberVO vo, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		MemberVO mvo = memberService.login(vo);
		if (mvo != null) {
			session.setAttribute("mvo", mvo);
		}
		return new ModelAndView("account_posts");
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null)
			session.invalidate();
		return "redirect:home.do";
	}	

}
