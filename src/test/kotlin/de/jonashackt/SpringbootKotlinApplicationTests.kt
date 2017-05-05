package de.jonashackt

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class SpringbootKotlinApplicationTests {

	@Autowired
	lateinit var mockMvc : MockMvc

	@MockBean
	lateinit var service : HotelService

	@Test
	fun contextLoads() {

		mockMvc.perform(MockMvcRequestBuilders.post("/hotel").content("""
		{
			"key" : "123";
			"name" : "someName"
		}
		"""))

		/*assertThat(service.getHotels(), contains(Hotel("123"))*/
	}

}
