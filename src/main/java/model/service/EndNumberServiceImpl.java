package model.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import model.dao.EndNumberDAO;
import model.domain.EndNumberDTO;

import org.springframework.stereotype.Service;


@Service("EndNumberService")
public class EndNumberServiceImpl implements EndNumberService {

	@Resource(name="EndNumberDAO")
	private EndNumberDAO endNumberDAO;
	
	private List<Map> result = new ArrayList<Map>();
	private Map<Integer, Integer> turn= new HashMap<Integer, Integer>();
	private Map<Integer, Integer> turn10= new HashMap<Integer, Integer>();
	private int[] temp = new int[6];
	
	@Override
	public List<Map> numberList() {
		
		List<EndNumberDTO> endList = endNumberDAO.totalNumberList();
		List<EndNumberDTO> endList2 = endNumberDAO.tenNumberList();
		
		//총 끝수 샘
		for(EndNumberDTO d : endList){
			String[] str = d.getWinningNumber().split("/");
			
			for(int t = 0 ; t<str.length ;t++)
				temp[t] = Integer.parseInt(str[t]);
			
			for(int i=0 ; i<temp.length; i++){
				int sameCount = 0;
				for(int j=0; j<temp.length; j++){
					if(temp[i]%10 == temp[j]%10){
						sameCount ++;
					}
				}
				
				if(sameCount == 1){
					if(!turn.containsKey(temp[i]%10)){	// 해당 끝수번호 포함 확인
						turn.put(temp[i]%10, 1);
					}else{
						int t = turn.get(temp[i]%10) + 1;
						turn.remove(temp[i]%10);
						turn.put(temp[i]%10, t);
					}
				}				
			}
		}
		result.add(turn);
		
		// 10개의 끝수 샘플 
		for(EndNumberDTO d : endList2){
			String[] str = d.getWinningNumber().split("/");
			
			for(int t = 0 ; t<str.length ;t++)
				temp[t] = Integer.parseInt(str[t]);
			
			for(int i=0 ; i<temp.length; i++){
				int sameCount = 0;
				for(int j=0; j<temp.length; j++){
					if(temp[i]%10 == temp[j]%10){
						sameCount ++;
					}
				}
				
				if(sameCount == 1){
					if(!turn10.containsKey(temp[i]%10)){	// 해당 끝수번호 포함 확인
						turn10.put(temp[i]%10, 1);
					}else{
						int t = turn10.get(temp[i]%10) + 1;
						turn10.remove(temp[i]%10);
						turn10.put(temp[i]%10, t);
					}
				}				
			}
		}
		result.add(turn10);
		return result;
	}

}
