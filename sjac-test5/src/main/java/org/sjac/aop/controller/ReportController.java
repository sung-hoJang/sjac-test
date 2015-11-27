package org.sjac.aop.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sjac.aop.model.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ReportController extends MultiActionController{
	private ReportService reportService;

	public ReportController(ReportService reportService) {
		super();
		this.reportService = reportService;
	}
	
	public ModelAndView showCount(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		List<Map> list = null; 
		list = reportService.showCount();
		
		return new ModelAndView("/response/report_result","list", list);
	}
	
}
