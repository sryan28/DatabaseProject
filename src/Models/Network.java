package Models;

public class Network {

	private String networkName;
	private int directDeposit;
	
	public Network() { }
	
	public Network(String networkName, int directDeposit) {
		this.networkName = networkName;
		this.directDeposit = directDeposit;
	}
	
	public String getNetworkName() { return networkName; }
	
	public void setNetworkName(String networkName) { this.networkName = networkName; }
	
	public int getDirectDeposit() { return directDeposit; }
	
	public void setDirectDeposit(int directDeposit) { this.directDeposit = directDeposit; }
	
}
