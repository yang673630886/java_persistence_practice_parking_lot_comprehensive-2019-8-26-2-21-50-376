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

//		List<ParkingBoy> parkingBoys = parkingBoyMapper.selectAllParkingBoys();
//		int count = parkingBoys.size();
//		int pageCount = count / pageSize;
//		if (count % pageSize != 0) {
//			pageCount += 1;
//		}
//		int skipEmployeeCount = (pageNum - 1) * pageSize;
//		List<ParkingBoy> resultEmployees = new ArrayList<ParkingBoy>();
//		for (int i = skipEmployeeCount; i < parkingBoys.size() && i < skipEmployeeCount + pageSize; i++) {
//			   resultEmployees.add(parkingBoys.get(i));

		int startNum = (pageNum-1) * pageSize;
		int endNum = pageNum * pageSize;
		
		return parkingBoyMapper.selectAllParkingBoysBypage(startNum,pageSize);
	}
	
	public String addParkingBoy() {
		return null;
		
		
	}

}
