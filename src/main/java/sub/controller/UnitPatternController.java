package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.UnitPatternDTO;
import model.service.UnitPatternService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitPatternController {
	@Resource(name = "UnitPatternService")
	private UnitPatternService unitPatternService;
	
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
		return mv;
	}
}
