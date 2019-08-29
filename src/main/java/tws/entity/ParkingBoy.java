package tws.entity;

public class ParkingBoy {
	private int parkingBoyId;
	private String parkingBoyName;
	private int parkingBoyAge;

	public int getParkingBoyId() {
		return parkingBoyId;
	}

	public void setParkingBoyId(int parkingBoyId) {
		this.parkingBoyId = parkingBoyId;
	}

	public String getParkingBoyName() {
		return parkingBoyName;
	}

	public void setParkingBoyName(String parkingBoyName) {
		this.parkingBoyName = parkingBoyName;
	}

	public int getParkingBoyAge() {
		return parkingBoyAge;
	}

	public void setParkingBoyAge(int parkingBoyAge) {
		this.parkingBoyAge = parkingBoyAge;
	}

	public ParkingBoy(int parkingBoyId, String parkingBoyName, int parkingBoyAge) {

		this.parkingBoyId = parkingBoyId;
		this.parkingBoyName = parkingBoyName;
		this.parkingBoyAge = parkingBoyAge;
	}

}
