package eg3;

public class Team {
	private int teamId;
	private String teamName;
	private String coach;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(int teamId, String teamName, String coach) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.coach = coach;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	
	
}
