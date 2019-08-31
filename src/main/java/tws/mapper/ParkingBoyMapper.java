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

	// OFFSET 5 ROWS FETCH NEXT 10 ROWS ONLY
	@Select("select * from parkingBoy offset #{startNum} ROWS FETCH NEXT #{pageSize} ROWS ONLY")
	public List<ParkingBoy> selectAllParkingBoysBypage(@Param("startNum")int startNum,@Param("pageSize") int pageSize);

	@Select("select * from parkinglot where parkingboy_id = #{parkingboy_id}")
	public List<ParkingLot> selectParkingBoyParkingLots(@Param("parkingboy_id") int parkingboy_id);
}
