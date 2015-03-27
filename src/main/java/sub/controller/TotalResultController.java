package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.domain.TotalResultDTO;
import model.service.TotalResultService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TotalResultController {
	@Resource(name = "TotalResultService")
	private TotalResultService unitStatsService;
	
	@RequestMapping("/selectWinningNumber.do")
	public ModelAndView selectWinningNumber(HttpServletRequest request) {
		List<TotalResultDTO> list = null;
		ModelAndView mv = new ModelAndView();
		list = unitStatsService.selectWinningNumber(); 
		mv.addObject("selectWinningNumber", list);
		mv.setViewName("index");
		return mv;
	}
}
