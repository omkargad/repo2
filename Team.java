package pojo;

public class Team {
	private String teamName;
	private Integer score;
	
	public void printScore() {
		System.out.println("Score card");
	}
	public String getTeamname() {
		return teamName;
	}
	public void setTeamname(String teamName) {
		this.teamName = teamName;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}

}
