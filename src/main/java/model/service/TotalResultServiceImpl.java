package model.service;

import java.util.List;

import javax.annotation.Resource;

import model.dao.TotalResultDAO;
import model.domain.TotalResultDTO;

import org.springframework.stereotype.Service;

@Service("TotalResultService")
public class TotalResultServiceImpl implements TotalResultService{
	@Resource(name="TotalResultDAO")
	private TotalResultDAO totalResultDao;

	@Override
	public List<TotalResultDTO> selectWinningNumber() {
		List<TotalResultDTO> unitList = totalResultDao.selectWinningNumber();
		for(TotalResultDTO d : unitList){
			System.out.println(d);
		}
		return totalResultDao.selectWinningNumber();
	}
}