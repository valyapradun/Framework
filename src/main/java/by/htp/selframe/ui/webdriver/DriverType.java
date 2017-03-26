package by.htp.selframe.ui.webdriver;

public enum DriverType {
	
	FIREFOX("firefox"), IE("internet explorer");
	
	private String driverName;
	
	private DriverType(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	
}
