package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingBoy;

@Mapper
public interface ParkingBoyMapper {
	
	@Select("select * from parkingBoy")
	public List<ParkingBoy> selectAllParkingBoys();
		
	

}
