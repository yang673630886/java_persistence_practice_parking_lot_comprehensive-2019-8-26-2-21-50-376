package tws.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;
import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.mapper.ParkingBoyMapper;
import tws.mapper.ParkingLotMapper;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingLotTest {
	
	@Autowired
	private ParkingLotMapper parkingLotMapper;

	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	@Test
	public void should_return_parkinglot_when_selectAllParkingLots_given_3_50_50_1() {
		// given
		jdbcTemplate.execute("INSERT INTO parkinglot VALUES(3,50,50, 1);");

		// when
		List<ParkingLot> parkingLots = parkingLotMapper.selectAllParkinglots();

		// then
		assertEquals(3, parkingLots.get(2).getParkingLotId());
		assertEquals(50, parkingLots.get(2).getParkingLotCapacity());
		assertEquals(50, parkingLots.get(2).getParkingLotAvailableCount());
		assertEquals(1, parkingLots.get(2).getParkingBoyId());
	}
}
