package Models;

public class Playlist {
	
	private String name;
	private int cid;
	
	public Playlist(String name, int cid) {
		this.name = name;
		this.cid = cid;
	}
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getCid() { return cid; }

	public void setCid(int cid) { this.cid = cid; }

}
