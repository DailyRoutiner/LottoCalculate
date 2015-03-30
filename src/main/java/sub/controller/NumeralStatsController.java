package sub.controller;

import java.util.List;

import javax.annotation.Resource;

import model.domain.NumeralStatsDTO;
import model.service.NumeralStatsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NumeralStatsController {
	@Resource(name = "NumeralStatsService")
	public NumeralStatsService NumeralStatsService;
	
	@RequestMapping("numeralstatslist.do")
	public ModelAndView numeralstatslist() {
		ModelAndView mv = new ModelAndView();
		List<NumeralStatsDTO> numeralstatslist = NumeralStatsService.list(); /*service.list();*/
		mv.addObject("NUMERALSTATS",numeralstatslist);

		mv.setViewName("numeralstatslist");
		
		return mv;
	}
}
