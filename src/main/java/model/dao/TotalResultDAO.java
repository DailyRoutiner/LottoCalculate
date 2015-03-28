package model.dao;

import java.util.List;

import model.domain.TotalResultDTO;

public interface TotalResultDAO {
	List<TotalResultDTO> selectWinningNumber();
}