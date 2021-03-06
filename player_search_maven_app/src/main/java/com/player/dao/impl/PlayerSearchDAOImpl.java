package com.player.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.player.dao.PlayerSearchDAO;
import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.dao.dbutil.PostgreSqlConnection;
import com.player.dao.dbutil.PlayerSearchQueries;



public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try {
			Connection connection = PostgreSqlConnection.getConnection();
			String sql = PlayerSearchQueries.GETPLAYERBYID;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,  id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player = new Player(id, resultSet.getString("name"), resultSet.getString("teamname"),
						resultSet.getInt("age"), resultSet.getLong("contact"), resultSet.getString("gender"));
			} else {
				throw new BusinessException("Invalid ID!!! No matching records found for the ID = " + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred. Kindly contact SYSADMIN.");
		}
		return player;	
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList = new ArrayList<>();;
		try {
			Connection connection = PostgreSqlConnection.getConnection();
			String sql = PlayerSearchQueries.GETALLPLAYERS;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// no value to be set
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("teamname"),
						resultSet.getInt("age"), resultSet.getLong("contact"), resultSet.getString("gender"));
				playerList.add(player);
			} 
			if (playerList.size() == 0)
			{
				throw new BusinessException("No player records available");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred. Kindly contact SYSADMIN.");
		}
		return playerList;	
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
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playerList = new ArrayList<>();;
		try {
			Connection connection = PostgreSqlConnection.getConnection();
			String sql = PlayerSearchQueries.GETPLAYERSBYGENDER;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// pass the gender
			preparedStatement.setString(1, gender.toUpperCase());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("teamname"),
						resultSet.getInt("age"), resultSet.getLong("contact"), gender);
				playerList.add(player);
			} 
			if (playerList.size() == 0)
			{
				throw new BusinessException("No players found with Gender " + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occurred. Kindly contact SYSADMIN.");
		}
		return playerList;	
	}
	
}
