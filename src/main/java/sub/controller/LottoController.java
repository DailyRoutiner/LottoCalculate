package sub.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

}
