package model.service;

import java.util.List;

import javax.annotation.Resource;

import model.dao.NumeralStatsDAO;
import model.dao.UnitPatternDAO;
import model.domain.NumeralStatsDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/*@Component("NumeralStatsService")*/
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
