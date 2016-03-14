package Models;

public class Studio {
	
	private String studioName;
	private int directDeposit;
	
	public Studio() { }
	
	public Studio(String studioName, int directDeposit) {
		this.studioName = studioName;
		this.directDeposit = directDeposit;
	}
	
	public String getStudioName() { return studioName; }
	
	public void setStudioName(String studioName) { this.studioName = studioName; }
	
	public int getDirectDeposit() { return directDeposit; }
	
	public void setDirectDeposit(int directDeposit) { this.directDeposit = directDeposit; }

}
