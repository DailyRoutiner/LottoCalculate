package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.UnitStatsDTO;
import model.service.UnitPatternService;
import model.service.UnitStatsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitStatsController {
	@Resource(name = "UnitStatsService")
	private UnitStatsService unitStatsService;
	
	@Resource(name = "UnitPatternService")
	private UnitPatternService unitPatternService;
	
	//단위 우선순위
	@RequestMapping("/unitPriority.do")
	public ModelAndView unitPriority(HttpServletRequest request) {
		List<UnitStatsDTO> unitList = null;
		ModelAndView mv = new ModelAndView();
		unitList = unitStatsService.unitPriority(5);
		mv.addObject("unitPriority", unitList);
		mv.setViewName("index");
		return mv;
	}
	
	//단위 출현 빈호 업데이트
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
