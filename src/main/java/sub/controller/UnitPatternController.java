package sub.controller;

import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.RandomNumberDTO;
import model.domain.UnitPatternDTO;
import model.domain.UnitStatsDTO;
import model.service.RandomNumberService;
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
	
	@Resource(name = "RandomNumberService")
	private RandomNumberService randomNumberService;
	
	@Resource(name = "UnitStatsService")
	private UnitStatsService unitStatsService;
	
	@RequestMapping(value = "/updatePatternFrequency.do")
	public String updatePatternFrequency(HttpServletRequest request,	
			@RequestParam("pattern") String pattern) {
		String page = " ";
		if (unitPatternService.updatePatternFrequency(pattern)) {
			page = "index";
		}
		return page;
	}
	
	@RequestMapping("/patternPriority.do")
	public ModelAndView patternPriority(HttpServletRequest request) {
		List<UnitPatternDTO> list = null;
		
		ModelAndView mv = new ModelAndView();
		list = unitPatternService.patternPriority(); 
		mv.addObject("patternPriority", list);
		mv.setViewName("index");
		
		List<UnitStatsDTO> unitPriority = null;
		unitPriority = unitStatsService.unitPriority(4);
		/* 수정중
		for(int i=0; i<list.size(); i++){
			//System.out.println(unitPriority.get(i).getUnitId());
			String pattern = (list.get(i).getPattern()).substring(1, 14);
			String token = null;
			StringTokenizer st = new StringTokenizer(pattern, ",");
			while(st.hasMoreTokens()){
				token = st.nextToken();
					int number = Integer.parseInt(token);
			}
			//randomNumberService.randomNumber(new RandomNumberDTO());
		}
		*/
		
		return mv;
	}
}
