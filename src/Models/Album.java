package Models;

import java.sql.Date;

public class Album {
	
	private int artId;
	private String albumTitle;
	private Date releaseDate;
	private String genre;
	
	public Album() { }
	
	public Album(int artId, String albumTitle, Date releaseDate, String genre) {
		this.artId = artId;
		this.albumTitle = albumTitle;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}
	
	public int getArtId() { return artId; }
	
	public String getAlbumTitle() { return albumTitle; }
	
	public Date getReleaseDate() { return releaseDate; }
	
	public String getGenre() { return genre; }
	
	public void setArtId(int artId) { this.artId = artId; }
	
	public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
	
	public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
	
	public void setGenre(String genre) { this.genre = genre; }

}
