package com.player.dao;

import java.util.List;
import com.player.exception.BusinessException;
import com.player.model.Player;

public interface PlayerSearchDAO {
	// get requirements from PlayerSearchService
	// may have separate requirements for DAO purposes
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException; 
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public Player getPlayerByContactNumber(long contact) throws BusinessException; // assume 1 player, 1 contact number
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;

}
