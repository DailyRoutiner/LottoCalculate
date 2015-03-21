package sub.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.domain.LottoDTO;
import model.service.LottoService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LottoController {

	@Resource(name = "LottoService")
	private LottoService lottoService;
	
	@RequestMapping("/hello.do")
	public ModelAndView hello(HttpServletRequest req) {
		List<LottoDTO> lt = null;
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		lt = lottoService.lottoNumList();
		System.out.println(lt);
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
