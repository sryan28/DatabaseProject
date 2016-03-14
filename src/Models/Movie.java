package Models;

public class Movie {
	
	private int mid;
	private String mediType;
	private String mName;
	private int releaseYear;
	private String studioName;
	private int price;
	private int rating;
	
	public Movie(int mid, String mediType, String mName, int releaseYear,
			String studioName, int price, int rating) {
		this.mid = mid;
		this.mediType = mediType;
		this.mName = mName;
		this.releaseYear = releaseYear;
		this.studioName = studioName;
		this.price = price;
		this.rating = rating;
	}
	
	public int getMid() { return mid; }
	
	public void setMid(int mid) { this.mid = mid; }
	
	public String getMediType() { return mediType; }
	
	public void setMediType(String mediType) { this.mediType = mediType; }
	
	public String getmName() { return mName; }
	
	public void setmName(String mName) { this.mName = mName; }
	
	public int getReleaseYear() { return releaseYear; }
	
	public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear;}
	
	public String getStudioName() { return studioName; }
	
	public void setStudioName(String studioName) { this.studioName = studioName; }
	
	public int getPrice() { return price; }
	
	public void setPrice(int price) { this.price = price;}
	
	public int getRating() { return rating; }
	
	public void setRating(int rating) { this.rating = rating; }

}
