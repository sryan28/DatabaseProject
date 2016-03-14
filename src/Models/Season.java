package Models;

import java.util.Date;

public class Season {

	private String tvTitle;
	private int releaseYear;
	private int sid;
	private Date startDate;
	private Date endDate;
	
	public Season(String tvTitle, int releaseYear, int sid, Date startDate,
			Date endDate) {
		this.tvTitle = tvTitle;
		this.releaseYear = releaseYear;
		this.sid = sid;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getTvTitle() { return tvTitle; }
	
	public void setTvTitle(String tvTitle) { this.tvTitle = tvTitle; }
	
	public int getReleaseYear() { return releaseYear; }
	
	public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
	
	public int getSid() { return sid; }
	
	public void setSid(int sid) { this.sid = sid; }
	
	public Date getStartDate() { return startDate; }
	
	public void setStartDate(Date startDate) { this.startDate = startDate; }
	
	public Date getEndDate() { return endDate; }
	
	public void setEndDate(Date endDate) { this.endDate = endDate; }
	
}
