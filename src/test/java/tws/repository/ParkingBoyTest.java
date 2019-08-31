package tws.repository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import javax.sql.DataSource;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import tws.entity.Employee;
import tws.entity.ParkingBoy;
import tws.mapper.ParkingBoyMapper;
import tws.service.ParkingBoyService;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyTest {

	@Autowired
	private ParkingBoyMapper parkingBoyMapper;

	@Autowired
	private MockMvc mockMvc;

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
		// given
		ParkingBoy parkingBoy = new ParkingBoy(12, "zhangsan", 21);

		// when
		parkingBoyMapper.addParkingBoy(parkingBoy);
		List<ParkingBoy> parkingBoys = parkingBoyMapper.selectAllParkingBoys();

		// then
		assertEquals("zhangsan", parkingBoys.get(11).getParkingBoyName());
		assertEquals(12, parkingBoys.get(11).getParkingBoyId());
		assertEquals(21, parkingBoys.get(11).getParkingBoyAge());
	}

//	@Test
//	public void shoud_return_service_addParkingBoy_when_controller_addParkingBoy_given_url() throws Exception {
//		ParkingBoyService parkingBoyService = mock(ParkingBoyService.class);
//		when(parkingBoyService.addParkingBoy()).thenReturn("11");
//
//		this.mockMvc.perform(post("/parkingboys").
//				contentType(MediaType.APPLICATION_JSON_UTF8)
//				.content(parkingBoyMapper.writeValueAsString(course))).
//		andDo(print()).andExpect(status().isOk());
//
//	}

}
