package sub.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.UnitPatternDTO;
import model.domain.UnitStatsDTO;
import model.service.UnitPatternService;
import model.service.UnitStatsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitPatternController {
	@Resource(name = "UnitPatternService")
	private UnitPatternService unitPatternService;
	
	@Resource(name = "UnitStatsService")
	private UnitStatsService unitStatsService;
	
	//패턴 출현 빈도 업데이트
	@RequestMapping(value = "/updatePatternFrequency.do")
	public String updatePatternFrequency(HttpServletRequest request,	
			@RequestParam("pattern") String pattern) {
		String page = " ";
		if (unitPatternService.updatePatternFrequency(pattern)) {
			page = "index";
		}
		return page;
	}
	
	//패턴 우선순위
	@RequestMapping("/patternPriority.do")
	public ModelAndView patternPriority(HttpServletRequest request) {
		Map<String, Integer> list = null;
		list = unitPatternService.patternPriority();
		ModelAndView mv = new ModelAndView();
		mv.addObject("patternPriority", list);
		mv.setViewName("index");
		
		return mv;
	}


}
