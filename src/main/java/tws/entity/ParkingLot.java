package tws.entity;

public class ParkingLot {
	private int parkingLotId;
	private int parkingLotCapacity;
	private int parkingLotAvailableCount;
	private int parkingBoyId;

	public ParkingLot(int parkingLotId, int parkingLotCapasity, int parkingLotAvailableCount, int parkingBoyId) {

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

	public int getParkingLotCapacity() {
		return parkingLotCapacity;
	}

	public void setParkingLotCapasity(int parkingLotCapacity) {
		this.parkingLotCapacity = parkingLotCapacity;
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
