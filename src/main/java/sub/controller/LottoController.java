package sub.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import model.service.EndNumberService;
import model.service.NumeralStatsService;
import model.service.UnitPatternService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LottoController {
	@Resource(name = "EndNumberService")
	private EndNumberService endNumberList;
	@Resource(name = "UnitPatternService")
	private UnitPatternService unitPatternService;
	@Resource(name = "NumeralStatsService")
	private NumeralStatsService numeralStatsService;
	
	
	@RequestMapping("/endNumber.do")
	public ModelAndView endNumberList(HttpServletRequest req) {
		List<Integer> list = endNumberList.getEndNumberList();
		ModelAndView mv = new ModelAndView();
		List<Integer> lottoNumber = new ArrayList<Integer>();
		Map<String, Integer> pattern = unitPatternService.patternPriority();
		
		lottoNumber= getLottoNumber(list, pattern);
		mv.addObject("lottoList", lottoNumber);
		mv.setViewName("index");
		return mv;
	}
	public static void reverseArrayfloat(float[] array) {
	    float temp;

	    for (int i = 0; i < array.length / 2; i++) {
	      temp = array[i];
	      array[i] = array[(array.length - 1) - i];
	      array[(array.length - 1) - i] = temp;
	    }
	}
	
	public List<Integer> getLottoNumber(List<Integer> list, Map<String, Integer> pattern ) {
		Map<Float, Integer> lottoList = new HashMap<Float, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		float[] temp =null;
		int[] count = new int[5];
		
		for(int i =0 ;i<list.size() ; i++){
			temp = sortEndPattern(list, lottoList, i);
			
			for(int t=0; t<temp.length ; t++){
				if (pattern.containsKey("A")) {
					if (1 <= lottoList.get(temp[t]) && lottoList.get(temp[t]) < 10) {
						if (pattern.get("A") > count[0]) {
							result.add(lottoList.get(temp[t]));
							count[0]++;
							break;
						}
					}
				}

				if (pattern.containsKey("B")) {
					if (10 <= lottoList.get(temp[t]) && lottoList.get(temp[t]) < 20) {
						if (pattern.get("B") > count[1]) {
							result.add(lottoList.get(temp[t]));
							count[1]++;
							break;
						}
					}
				}

				if (pattern.containsKey("C")) {
					if (20 <= lottoList.get(temp[t]) && lottoList.get(temp[t]) < 30) {
						if (pattern.get("C") > count[2]) {
							result.add(lottoList.get(temp[t]));
							count[2]++;
							break;
						}
					}
				}

				if (pattern.containsKey("D")) {
					if (30 <= lottoList.get(temp[t]) && lottoList.get(temp[t]) < 40) {
						if (pattern.get("D") > count[3]) {
							result.add(lottoList.get(temp[t]));
							count[3]++;
							break;
						}
					}
				}

				if (pattern.containsKey("E")) {
					if (40 <= lottoList.get(temp[t])) {
						if (pattern.get("E") > count[3]) {
							result.add(lottoList.get(temp[t]));
							count[4]++;
							break;
						}
					}
				}
			}
			
		}
			
		return result;
	}
	
	private float[] sortEndPattern(List<Integer> list,	Map<Float, Integer> lottoList, int i) {
		float[] temp;
		if(list.get(i)<=5){
			temp = new float[5];
			for (int x = 0; x < 5; x++) {
				if(list.get(i) ==0 && x==0){
					continue;
				}else{
					temp[x] = numeralStatsService.getStat(list.get(i) + (x * 10));
				}
			}
		}else{
			temp = new float[4];
			for (int x = 0; x < 4; x++) 
				temp[x] = numeralStatsService.getStat(list.get(i) + (x * 10));
		}
		Arrays.sort(temp);
		reverseArrayfloat(temp);
		if(list.get(i)<=5){
			for (int x = 0; x < 5; x++) 
				if(list.get(i) ==0 && x==0){
					continue;
				}else{
					lottoList.put(numeralStatsService.getStat(list.get(i) + (x * 10)), list.get(i) + (x * 10));
				}
		}else{
			for (int x = 0; x < 4; x++) 
				lottoList.put(numeralStatsService.getStat(list.get(i) + (x * 10)), list.get(i) + (x * 10));
		}
		return temp;
	}
}
