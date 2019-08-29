package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.mapper.ParkingBoyMapper;

@RestController
@RequestMapping("/parkingboys")
public class ParkingBoyController {

	@Autowired
	private ParkingBoyMapper parkingBoyMapper;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ParkingBoy> selectAllParkingBoys() {
		return parkingBoyMapper.selectAllParkingBoys();
	}

	@GetMapping("/{parkingboysId}/parkinglots")
	@ResponseStatus(HttpStatus.OK)
	public List<ParkingLot> selectParkingLots(@PathVariable int parkingboysId) {
		return parkingBoyMapper.selectParkingBoyParkingLots(parkingboysId);
	}

}
