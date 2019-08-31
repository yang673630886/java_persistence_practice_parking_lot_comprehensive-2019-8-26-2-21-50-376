package tws.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.mapper.ParkingBoyMapper;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyTest {
	
	@Autowired
	private ParkingBoyMapper parkingBoyMapper;
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Test
	public void should_return_parkingboy_when_selectAllParkingBoys_given_12_zhangsan_21() {
		// given
        jdbcTemplate.execute("INSERT INTO parkingboy VALUES(12,'zhangsan', 21);");
        
        // when
        List<ParkingBoy> parkingBoys = parkingBoyMapper.selectAllParkingBoys();
        
        // then
        assertEquals("zhangsan", parkingBoys.get(11).getParkingBoyName());
        assertEquals(12, parkingBoys.get(11).getParkingBoyId());
        assertEquals(21, parkingBoys.get(11).getParkingBoyAge());
	}
	
	@Test
	public void should_return_parkingboy_when_addParkingBoy_given_12_zhangsan_21() {
		//given
		ParkingBoy parkingBoy = new ParkingBoy(12,"zhangsan", 21);
		
		//when
		parkingBoyMapper.addParkingBoy(parkingBoy);
		List<ParkingBoy> parkingBoys = parkingBoyMapper.selectAllParkingBoys();
		
		//then
		assertEquals("zhangsan", parkingBoys.get(11).getParkingBoyName());
        assertEquals(12, parkingBoys.get(11).getParkingBoyId());
        assertEquals(21, parkingBoys.get(11).getParkingBoyAge());
	}

}
