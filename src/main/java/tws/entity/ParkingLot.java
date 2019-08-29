package tws.entity;

public class ParkingLot {
	private int parkingLotId;
	private int parkingLotCapasity;
	private int parkingLotAvailableCount;
	private int parkingBoyId;

	public ParkingLot(int parkingLotId, int parkingLotCapasity, int parkingLotAvailableCount, int parkingBoyId) {
		super();
		this.setParkingLotId(parkingLotId);
		this.setParkingLotCapasity(parkingLotCapasity);
		this.setParkingLotAvailableCount(parkingLotAvailableCount);
		this.setParkingBoyId(parkingBoyId);
	}

	public int getParkingLotId() {
		return parkingLotId;
	}

	public void setParkingLotId(int parkingLotId) {
		this.parkingLotId = parkingLotId;
	}

	public int getParkingLotCapasity() {
		return parkingLotCapasity;
	}

	public void setParkingLotCapasity(int parkingLotCapasity) {
		this.parkingLotCapasity = parkingLotCapasity;
	}

	public int getParkingLotAvailableCount() {
		return parkingLotAvailableCount;
	}

	public void setParkingLotAvailableCount(int parkingLotAvailableCount) {
		this.parkingLotAvailableCount = parkingLotAvailableCount;
	}

	public int getParkingBoyId() {
		return parkingBoyId;
	}

	public void setParkingBoyId(int parkingBoyId) {
		this.parkingBoyId = parkingBoyId;
	}

}
