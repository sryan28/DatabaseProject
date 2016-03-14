package Models;

public class TVSeries {

	private String tvTitle;
	private int releaseYear;
	private String networkName;
	private int pricePerEp;
	private String genre;
	private int rating;
	
	public TVSeries(String tvTitle, int releaseYear, String networkName,
			int pricePerEp, String genre, int rating) {
		this.tvTitle = tvTitle;
		this.releaseYear = releaseYear;
		this.networkName = networkName;
		this.pricePerEp = pricePerEp;
		this.genre = genre;
		this.rating = rating;
	}
	
	public String getTvTitle() { return tvTitle; }
	
	public void setTvTitle(String tvTitle) { this.tvTitle = tvTitle; }
	
	public int getReleaseYear() { return releaseYear; }
	
	public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
	
	public String getNetworkName() { return networkName; }
	
	public void setNetworkName(String networkName) { this.networkName = networkName; }
	
	public int getPricePerEp() { return pricePerEp; }
	
	public void setPricePerEp(int pricePerEp) { this.pricePerEp = pricePerEp; }
	
	public String getGenre() { return genre; }
	
	public void setGenre(String genre) { this.genre = genre; }
	
	public int getRating() { return rating; }
	
	public void setRating(int rating) { this.rating = rating; }
	
}
