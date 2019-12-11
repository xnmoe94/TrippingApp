package Controllers;

public class TripHistroyData {
	
	
	private String CustomerName, StartLocation, EndLocation;
	
	
	
	

	public TripHistroyData(String customerName, String startLocation, String endLocation) {
		super();
		CustomerName = customerName;
		StartLocation = startLocation;
		EndLocation = endLocation;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getStartLocation() {
		return StartLocation;
	}

	public void setStartLocation(String startLocation) {
		StartLocation = startLocation;
	}

	public String getEndLocation() {
		return EndLocation;
	}

	public void setEndLocation(String endLocation) {
		EndLocation = endLocation;
	}
	
	

}

	

