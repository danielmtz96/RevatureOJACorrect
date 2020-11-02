package com.app.jdbc;

import com.app.jdbc.dao.PlayerDAO;
import com.app.jdbc.dao.impl.PlayerDAOImpl;
import com.app.jdbc.exception.BusinessException;
import com.app.jdbc.model.Player;

public class JDBCDemoMain {
	public static void main(String[] args) {
		//Player player = new Player(106, "Fatima", "Bulls", 23, 91234567890L, "F");
		
		PlayerDAO playerDAO = new PlayerDAOImpl();
		
		/*
		try {
			if(playerDAO.createPlayer(player) > 0) {
				System.out.println("Player created on DB with below details.");
				System.out.println(player);
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} */
		
		
		try {
			int id = 107;
			Player player = playerDAO.getPlayerById(id);
			if(player!= null) {
				System.out.println("Player found with id " + id + " details are: ");
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

	}
	
}
