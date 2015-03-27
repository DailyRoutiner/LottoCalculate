package sub.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.service.UnitPatternService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
