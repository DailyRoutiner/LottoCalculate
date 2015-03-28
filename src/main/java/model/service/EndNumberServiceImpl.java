package model.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import model.dao.EndNumberDAO;

import org.springframework.stereotype.Service;


@Service("EndNumberService")
public class EndNumberServiceImpl implements EndNumberService {
	
	@Resource(name="EndNumberDAO")
	private EndNumberDAO endNumberDAO;
	
	@Override
	public List<Integer> getEndNumberList() {
		Map<Integer, Integer> endList = endNumberDAO.totalNumberList();
		Map<Integer, Integer> endList2 = endNumberDAO.tenNumberList();
		float totalTurn = 641;
		float tenTurn = 10;
		Map<Float, Integer> list = new HashMap<Float, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		float[] temp = new float[10];
		
		for(int x=0; x<tenTurn; x++){
			temp[x] = (endList.get(x)/totalTurn) - (endList2.get(x)/tenTurn);
		}
		Arrays.sort(temp);
		reverseArrayfloat(temp);
		for(int i =0 ;i<tenTurn ;i++){ 
			list.put((endList.get(i)/totalTurn) - (endList2.get(i)/tenTurn), i);
		}
		
		for(float d :temp){
			result.add(list.get(d));
		}

		return result;
	}
	
	public static void reverseArrayfloat(float[] array) {
	    float temp;

	    for (int i = 0; i < array.length / 2; i++) {
	      temp = array[i];
	      array[i] = array[(array.length - 1) - i];
	      array[(array.length - 1) - i] = temp;
	    }
	  }
}
