package sub.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.domain.MeetingDTO;
import model.service.MeetingService;

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
public class MeetingController {
	
	@Resource(name="meetingService")
    private MeetingService meetingService;
		
		//모임 삭제
		@RequestMapping(value="deleteMeeting.do", method=RequestMethod.GET)
		public ModelAndView deleteMeeting(@RequestParam int meetno,
															
				                                            HttpServletRequest req){
			// manageno, meetno, 먼저 모임안에 있는 멤버들 삭제
			HttpSession session=req.getSession();
			int result=0;
			int result2=0;
			
					  if(result2 >0){
						  if(result > 0){
							  System.out.println("모임목록 삭제 성공!");
						  }else{
							  System.out.println("모임 삭제 실패 :" + meetno);
					  }
					  System.out.println("result : " +result + result2);
				   }
				 ModelAndView mv=new ModelAndView();
		         mv.setViewName("main");
				return mv;
		}
	
		
	
}
