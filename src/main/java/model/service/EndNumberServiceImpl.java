package model.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import model.dao.EndNumberDAO;
import model.domain.EndNumber;

import org.springframework.stereotype.Service;


@Service("EndNumberService")
public class EndNumberServiceImpl implements EndNumberService {

	@Resource(name="EndNumberDAO")
	private EndNumberDAO endNum;

	@Override
	public List<EndNumber> numberList() {
		List<EndNumber> endList = endNum.numberList();
		for(EndNumber d : endList){
			
		}
		return endNum.numberList();
	}

}
