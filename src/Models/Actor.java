package Models;

public class Actor {
	
	private int actId;
	private String name;
	
	public Actor(int actId, String name) {
		this.name = name;
		this.actId = actId;
	}
	
	public int getActId() { return actId; }
	
	public String getName() { return name; }
	
	public void setActId(int actId) { this.actId = actId; }
	
	public void setName(String name) { this.name = name; }

}
