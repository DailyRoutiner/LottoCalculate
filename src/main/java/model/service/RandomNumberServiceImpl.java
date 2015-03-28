package model.service;

import java.util.List;

import javax.annotation.Resource;

import model.dao.RandomNumberDAO;
import model.domain.RandomNumberDTO;

import org.springframework.stereotype.Service;

@Service("RandomNumberService")
public class RandomNumberServiceImpl implements RandomNumberService{
	@Resource(name="RandomNumberDAO")
	private RandomNumberDAO randomNumberDao;

	@Override
	public List<RandomNumberDTO> randomNumber(RandomNumberDTO randomNumber) {
		return randomNumberDao.randomNumber(randomNumber);
	}
}