package model.service;

import java.util.List;

import model.domain.TotalResultDTO;

public interface TotalResultService {
	List<TotalResultDTO> selectWinningNumber();
}

