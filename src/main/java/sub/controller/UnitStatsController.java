package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.UnitStatsDTO;
import model.service.UnitStatsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitStatsController {
	@Resource(name = "UnitStatsService")
	private UnitStatsService unitStatsService;
	
	@RequestMapping("/unitPriority.do")
	public ModelAndView unitPriority(HttpServletRequest request) {
		List<UnitStatsDTO> list = null;
		ModelAndView mv = new ModelAndView();
		list = unitStatsService.unitPriority(); 
		mv.addObject("unitPriority", list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value = "/updateUnitFrequency.do")
	public String updateUnitFrequency(HttpServletRequest request,	
			@RequestParam("unitId") String unitId) {
		String page = " ";
		if (unitStatsService.updateUnitFrequency(unitId)) {
			page = "index";
		}
		return page;
	}
}
