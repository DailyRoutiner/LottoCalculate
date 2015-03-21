package sub.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.domain.LottoDTO;
import model.service.LottoService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LottoController {

	@Resource(name = "LottoService")
	private static LottoService lottoService;
	
	@RequestMapping("/hello.do")
	public ModelAndView hello(HttpServletRequest req) {
		List<LottoDTO> lt = null;
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		lt = lottoService.lottoNumList();
		session.setAttribute("list", lt);
		mv.addObject("list", lt);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/sectionPriority.do")
	public ModelAndView sectionPriority(HttpServletRequest req) {
		List<LottoDTO> lt = null;
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		lt = lottoService.sectionPriority();
		session.setAttribute("sectionPriority", lt);
		mv.addObject("sectionPriority", lt);
		mv.setViewName("index");
		return mv;
	}	

}
