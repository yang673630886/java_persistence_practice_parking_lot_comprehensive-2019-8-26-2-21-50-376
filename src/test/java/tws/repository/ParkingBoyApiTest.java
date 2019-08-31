package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import tws.entity.ParkingBoy;

import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingBoyApiTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper ObjectMapper;
	
	@Test
	public void shoud_return_service_addParkingBoy_when_controller_addParkingBoy_given_url() throws Exception {
		
		ParkingBoy parkingBoy =  new ParkingBoy(30,"aaa",22);
		String postString =ObjectMapper.writeValueAsString(parkingBoy);
		//when
		
		this.mockMvc.perform(MockMvcRequestBuilders
		        .post("/parkingboys")
		        .contentType(MediaType.APPLICATION_JSON)
		        .content(postString))
        .andDo(print()).andExpect(status().isCreated());
//		
//		MockMvcRequestBuilders
//        .post("/employees")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(postString)
		
	}

}
