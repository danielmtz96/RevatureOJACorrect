package com.player.service;

import java.util.List;


import com.player.model.Player;
import com.player.exception.BusinessException;

public interface PlayerSearchService {
	
	// search services for application
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException; 
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public Player getPlayerByContactNumber(long contact) throws BusinessException; // assume 1 player, 1 contact number
	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;
	
	
}
