package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {
	
	@Select("select * from parkinglot")
	public List<ParkingLot> selectAllParkinglots();
	

}
