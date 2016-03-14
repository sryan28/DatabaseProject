package Models;

public class Artist {
	
	private int artId;
	private String name;
	
	public Artist(int artId, String name) {
		this.artId = artId;
		this.name = name;
	}
	
	public int getArtId() { return artId; }
	
	public String getName() { return name; }
	
	public void setArtId(int artId) { this.artId = artId; }
	
	public void setName(String name) { this.name = name; }

}
