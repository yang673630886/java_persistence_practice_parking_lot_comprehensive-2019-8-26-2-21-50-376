package tws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.ParkingBoy;
import tws.mapper.ParkingBoyMapper;

@Service
public class ParkingBoyService {

	@Autowired
	private ParkingBoyMapper parkingBoyMapper;

	public List<ParkingBoy> findAllParkingBoys(int pageSize, int pageNum) {

		int startNum = (pageNum-1) * pageSize;
		int endNum = pageNum * pageSize;
		
		return parkingBoyMapper.selectAllParkingBoysBypage(startNum,pageSize);
	}
	
	public String addParkingBoy(ParkingBoy parkingBoy) {
		parkingBoyMapper.addParkingBoy(parkingBoy);
		return null;
		
		
	}

}
