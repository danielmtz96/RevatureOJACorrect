package com.player.service.impl;

import java.util.List;

import com.player.dao.PlayerSearchDAO;
import com.player.dao.impl.PlayerSearchDAOImpl;
import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerSearchService;

public class PlayerSearchServiceImplementer implements PlayerSearchService {

	private PlayerSearchDAO searchDAO = new PlayerSearchDAOImpl();
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if(id > 99 && id < 1000) {
			// code here for DAO
			player = searchDAO.getPlayerById(id); // handshake between service layer & DAO layer 
		} else {
			throw new BusinessException("Entered Player ID " + id + " is invalid! Please re-enter.");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		
		List<Player> playersList = null; // will be instantiated by DB. Don't instantiate twice.
	    playersList = searchDAO.getAllPlayers();
		return playersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayerByContactNumber(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerListGender = null;
		if(gender!= null & gender.matches("[mMfFoO]{1}")) {
			playerListGender = searchDAO.getPlayersByGender(gender);
		} else {
			throw new BusinessException("Entered Gender " + gender + " is invalid. Please re-enter appropriate choice.");
		}
		return playerListGender;
	}
		
}
