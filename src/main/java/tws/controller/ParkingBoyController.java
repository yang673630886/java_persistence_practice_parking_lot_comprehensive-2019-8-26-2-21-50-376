package tws.controller;

import java.util.List;

import org.hamcrest.core.Is;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.mapper.ParkingBoyMapper;
import tws.service.ParkingBoyService;

@RestController
@RequestMapping("/parkingboys")
public class ParkingBoyController {

	@Autowired
	private ParkingBoyMapper parkingBoyMapper;
	@Autowired
	private ParkingBoyService parkingBoyService;

	@GetMapping("")
	@ResponseStatus(HttpStatus.OK)
	public List<ParkingBoy> selectAllParkingBoys(@RequestParam(name = "pageSize", required = false) Integer pageSize,
			@RequestParam(name = "pageNum", required = false) Integer pageNum) {
		if (pageSize == null & pageNum == null) {
			List<ParkingBoy> parkingBoy = parkingBoyMapper.selectAllParkingBoys();
			return parkingBoy;
		}
		return parkingBoyService.findAllParkingBoys(pageSize, pageNum);
	}

	@GetMapping("/{parkingboysId}/parkinglots")
	@ResponseStatus(HttpStatus.OK)
	public List<ParkingLot> selectParkingLots(@PathVariable int parkingboysId) {
		return parkingBoyMapper.selectParkingBoyParkingLots(parkingboysId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String addParkingBoy(@RequestBody ParkingBoy parkingBoy) {
		return parkingBoyService.addParkingBoy(parkingBoy);
	}

}
