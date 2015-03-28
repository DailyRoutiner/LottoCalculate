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
		List<UnitPatternDTO> list = null;
		list = unitPatternService.patternPriority();
		ModelAndView mv = new ModelAndView();
		mv.addObject("patternPriority", list);
		mv.setViewName("index");
		
		return mv;
	}

	//끝수패턴으로 (단위+패턴) 정보 전달 - Map 형태
	public Map<String, Integer> hashMap() {
		List<UnitStatsDTO> unitList = unitStatsService.unitPriority(5);
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		String pattern = unitPatternService.patternPriority().get(0).getPattern(); 
		pattern = pattern.replaceAll(" ", "");
		pattern = pattern.substring(1, 10);
		pattern = pattern.replaceAll("0,", "");

		String token = null;
		StringTokenizer st = new StringTokenizer(pattern, ",");
		int temp[] = new int[5];
		int i = 0;
		
		while(st.hasMoreTokens()){
			token = st.nextToken();
			int number = Integer.parseInt(token);
			temp[i]=number;
			i++;
		}

		int z = i-1;
		
		for(int j=0; j<i; j++){
			hashMap.put(unitList.get(j).getUnitId(), temp[z]);
			z--;
		}
		
		return hashMap;
	}
}
