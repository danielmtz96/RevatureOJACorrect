package com.player.main;

import java.util.List;
import java.util.Scanner;

import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerSearchService;
import com.player.service.impl.PlayerSearchServiceImplementer;

public class PlayerMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Daniel's Player Search App V1.0");
		System.out.println("------------------------------------------");
		PlayerSearchService playerSearchService = new PlayerSearchServiceImplementer();
		int ch = 0;
		do {
			System.out.println("Player Search Menu");
			System.out.println("==================");
			System.out.println("1) By ID " );
			System.out.println("2) By Name ");
			System.out.println("3) By Age ");
			System.out.println("4) By Gender ");
			System.out.println("5) By Contact ");
			System.out.println("6) By TeamName ");
			System.out.println("7) All Players ");
			System.out.println("8) Exit ");
			System.out.println("Please enter appropriate choice (1-8)");
			try {
				ch = Integer.parseInt(scanner.nextLine());
				
			} catch(NumberFormatException e) {
				
			}
			
			switch (ch) { // ID
			case 1: System.out.println("Please enter Player ID to get Player Details.");
				try {
				int id = Integer.parseInt(scanner.nextLine());
					// code here for service layer
					Player player = playerSearchService.getPlayerById(id);
					if(player!= null) {
						System.out.println("We found a player by ID = " + id + " Details: ");
						System.out.println(player);
					}
				} catch (NumberFormatException e) {
					System.out.println("ID should be a number only. Kindly re-enter.");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:  System.out.println("Thank you for your interest. This option is still under construction.");
			//Name
				break;
			case 3:  System.out.println("Thank you for your interest. This option is still under construction.");
				break;
			case 4:  System.out.println("Please enter gender (m/f/o) to get the Players with that gender.");
			// gender
				String gender = scanner.nextLine();
				try {
					List<Player> playersListGender = playerSearchService.getPlayersByGender(gender);
					if(playersListGender!=null && playersListGender.size()> 0) {
						System.out.println("We found " + playersListGender.size() + " no. of player(s) in the DB. with gender" 
								+ gender +  " Details are:");
						for(Player p:playersListGender) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());

				}
				break;
			case 5:  System.out.println("Thank you for your interest. This option is still under construction.");
				break;
			case 6:  System.out.println("Thank you for your interest. This option is still under construction.");
				break;
			case 7:  // all players			
				try {
				List<Player> playersList = playerSearchService.getAllPlayers();
				if(playersList!=null && playersList.size()> 0) {
					System.out.println("We found " + playersList.size() + " no. of player(s) in the DB. "
							+ "Details are:");
					for(Player p:playersList) {
						System.out.println(p);
					}
				}
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
				break;
			case 8:  System.out.println("Thank you for using Daniel's Player Search App V1.0... We would expect you back very soon.");
				break;
			default: System.out.println("Invalid choice!!! Please enter choice between 1 and 8 only.");
				break;
			}
			
		} while(ch!= 8);
		
	}
}
