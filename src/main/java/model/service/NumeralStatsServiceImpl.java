package model.service;

import java.util.List;

import javax.annotation.Resource;

import model.dao.NumeralStatsDAO;
import model.domain.NumeralStatsDTO;

import org.springframework.stereotype.Service;


@Service("NumeralStatsService")
public class NumeralStatsServiceImpl implements NumeralStatsService{

	@Resource(name="NumeralStatsDAO")
	private NumeralStatsDAO NumeralStatsDAO;
	
	@Override
	public List<NumeralStatsDTO> list(){
		return NumeralStatsDAO.list();
	}

	@Override
	public float getStat(int number) {
		return NumeralStatsDAO.getStat(number);
	}
	
}
