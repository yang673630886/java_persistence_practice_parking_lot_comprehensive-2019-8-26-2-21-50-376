package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingLot;
import tws.mapper.ParkingLotMapper;

@RestController
@RequestMapping("/parkinglots")
public class ParkingLotController {
	
	@Autowired
	private ParkingLotMapper parkingLotMapper;
	
	@GetMapping
	public List<ParkingLot> selectAllParkingLots(){
		return parkingLotMapper.selectAllParkinglots();
	}

}
