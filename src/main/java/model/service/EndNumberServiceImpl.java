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

	@Override
	public List<EndNumberDTO> numberList() {
		
		List<EndNumberDTO> endList = endNumberDAO.numberList();
		for(EndNumberDTO d : endList){
			
		}
		return endNumberDAO.numberList();
	}

}
