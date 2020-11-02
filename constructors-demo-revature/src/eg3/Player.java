package eg3;

public class Player {
	private int id;
	private String name;
	private Team team; // can use Team class here
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public void printPlayer() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		if(team!=null) {
			System.out.println("Team details");
			System.out.println("Team ID: " + team.getTeamId());
			System.out.println("Teamn name: "+ team.getTeamName());
			System.out.println("Coach: " + team.getCoach());
		}
		else {
			System.out.println("Player has no team");
		}
	}
	
}
