package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

@Mapper
public interface ParkingBoyMapper {
	
	@Select("select * from parkingBoy")
	public List<ParkingBoy> selectAllParkingBoys();
	
	@Select("select * from parkinglot where parkingboy_id = #{parkingboy_id}")
	public List<ParkingLot> selectParkingBoyParkingLots(@Param("parkingboy_id") int parkingboy_id);
}
