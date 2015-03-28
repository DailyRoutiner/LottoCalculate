package sub.controller;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.TotalResultDTO;
import model.service.TotalResultService;
import model.service.UnitPatternService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TotalResultController {
	@Resource(name = "TotalResultService")
	private TotalResultService totalResultService;
	
	@Resource(name = "UnitPatternService")
	private UnitPatternService unitPatternService;
	
	@RequestMapping("/selectWinningNumber.do")
	public ModelAndView selectWinningNumber(HttpServletRequest request) {
		List<TotalResultDTO> list = null;
		ModelAndView mv = new ModelAndView();
		list = totalResultService.selectWinningNumber(); 	
		
		unitPatternService.initialization();
		
		for(TotalResultDTO total : list){
			int[] unit = new int[5];
			String pattern = null;
			String token = null;
			StringTokenizer st = new StringTokenizer(total.getWinningNumber(), "/");
			while(st.hasMoreTokens()){
				token = st.nextToken();
					int number = Integer.parseInt(token);
					if(number < 10) {
						unit[0]++;
					}else if(number>=10 && number <20){
						unit[1]++;							
					}else if(number>=20 && number <30){
						unit[2]++;						
					}else if(number>=30 && number <40){
						unit[3]++;						
					}else if(number>=40 && number <46){
						unit[4]++;						
					}
			}
			Arrays.sort(unit);
			pattern = Arrays.toString(unit);
			unitPatternService.updatePatternFrequency(pattern);
		}
		
		mv.addObject("selectWinningNumber", list);
		mv.setViewName("index");

		return mv;
	}
	
}
