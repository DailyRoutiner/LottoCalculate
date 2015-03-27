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
	
	@RequestMapping("/unitPriority.do")
	public ModelAndView unitPriority(HttpServletRequest request) {
		List<UnitStatsDTO> unitList = null;
		/*수정 중
		List<UnitPatternDTO> patternList = null;
		ModelAndView mv = new ModelAndView();
		patternList = unitPatternService.patternPriority();
		
		for(UnitPatternDTO pattern : patternList){
			unitList = unitStatsService.unitPriority(pattern.getUnitNumber());
			mv.addObject("unitPriority", unitList);
		}
		*/
		ModelAndView mv = new ModelAndView();
		unitList = unitStatsService.unitPriority(4); // 4는 test 값
		mv.addObject("unitPriority", unitList);
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
