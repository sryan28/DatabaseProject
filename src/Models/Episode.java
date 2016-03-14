package Models;

import java.util.Date;

public class Episode {
	
	private int mid;
	private String mediaType;
	private String tvTitle;
	private int releaseYear;
	private int sid;
	private int epid;
	private String epName;
	private String descrition;
	private Date releaseDate;
	
	public Episode(int mid, String mediaType, String tvTitle, int releaseYear, int sid,
			int epid, String epName, String description, Date releaseDate) {
		this.mid = mid;
		this.mediaType = mediaType;
		this.tvTitle = tvTitle;
		this.releaseYear = releaseYear;
		this.epid = epid;
		this.epName = epName;
		this.descrition = description;
		this.releaseDate = releaseDate;
	}

	public int getMid() { return mid; }

	public void setMid(int mid) { this.mid = mid; }

	public String getMediaType() { return mediaType; }

	public void setMediaType(String mediaType) { this.mediaType = mediaType; }

	public String getTvTitle() { return tvTitle; }

	public void setTvTitle(String tvTitle) { this.tvTitle = tvTitle; }

	public int getReleaseYear() { return releaseYear; }

	public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

	public int getSid() { return sid; }

	public void setSid(int sid) { this.sid = sid; }

	public int getEpid() { return epid; }

	public void setEpid(int epid) { this.epid = epid; }

	public String getEpName() { return epName; }

	public void setEpName(String epName) { this.epName = epName; }

	public String getDescrition() { return descrition; }

	public void setDescrition(String descrition) { this.descrition = descrition; }

	public Date getReleaseDate() { return releaseDate; }

	public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }

}
