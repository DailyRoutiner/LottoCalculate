package model.service;


import java.util.List;

import javax.annotation.Resource;

import model.dao.LottoDAO;
import model.domain.LottoDTO;

import org.springframework.stereotype.Service;


@Service("LottoService")
public class LottoServiceImpl implements LottoService {

	@Resource(name="LottoDAO")
	private LottoDAO lottoDao;
	
	@Override
	public List<LottoDTO> lottoNumList() {
		return lottoDao.LottoNumList();
	}
	
}
