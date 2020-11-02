package eg2;

public class Team {
	private int teamid;
	private String teamname;
	private String coachname;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(int teamid, String teamname, String coachname) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.coachname = coachname;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	
	public void printTeam() {
		System.out.println("Team details");
		System.out.println("Team id: " + teamid);
		System.out.println("Team Name: " + teamname);
		System.out.println("Coach name: " + coachname);
	}
	
}
