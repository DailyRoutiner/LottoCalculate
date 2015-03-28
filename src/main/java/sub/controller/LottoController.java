package sub.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.service.EndNumberService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LottoController {
	@Resource(name = "EndNumberService")
	private EndNumberService endNumberList;
	
	@RequestMapping("/endNumber.do")
	public ModelAndView endNumberList(HttpServletRequest req) {
		List<Integer> list = null;
		ModelAndView mv = new ModelAndView();
		list = endNumberList.getEndNumberList(); 
		mv.addObject("endList", list);
		mv.setViewName("index");
		return mv;
	}
	
}
