package Models;

import java.sql.Date;

public class Song {
	
	private int mid;
	private String mediaType;
	private int artId;
	private String albumTitle;
	private int trackNum;
	private String title;
	private String genre;
	private int duration;
	private Date recordDate;
	private Date releaseDate;
	
	public Song() { }
	
	public Song(int mid, String mediaType, int artId, String albumTitle, int trackNum,
			String title, String genre, int duration, Date recordDate, Date releaseDate) {
		this.mid = mid;
		this.mediaType = mediaType;
		this.artId = artId;
		this.albumTitle = albumTitle;
		this.trackNum = trackNum;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.recordDate = recordDate;
		this.releaseDate = releaseDate;
	}
	
	public int getMid() { return mid; }
	
	public String getMediaType() { return mediaType; }
	
	public int getArtId() { return artId; }
	
	public String getAlbumTitle() { return albumTitle; }
	
	public int getTrackNum() { return trackNum; }
	
	public String getTitle() { return title; }
	
	public String getGenre() { return genre; }
	
	public int getDuration() { return duration; }
	
	public Date  getRecordDate() { return recordDate; }
	
	public Date getReleaseDate() { return releaseDate; }
	
	public void setMid(int mid) { this.mid = mid; }
	
	public void setMediaType(String mediaType) { this.mediaType = mediaType; }
	
	public void setArtId(int artId) { this.artId = artId; }
	
	public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
	
	public void setTrackNum(int trackNum) { this.trackNum = trackNum; }
	
	public void setTitle(String title) { this.title = title; }
	
	public void setGenre(String genre) { this.genre = genre; }
	
	public void setDuration(int duration) { this.duration = duration; }
	
	public void setRecordDate(Date recordDate) { this.recordDate = recordDate; }
	
	public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
	
}
