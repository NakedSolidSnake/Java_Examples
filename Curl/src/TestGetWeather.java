import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import domain.WeatherInfo;

class TestGetWeather {

	@Test
	void test() {
		String endpoint = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=f8d326fa12a0b20698fd9681ef193112";
		String message = null;
		
		try {
			message = Request.Get(endpoint);
			Gson gson = new Gson();
			WeatherInfo weatherInfo = gson.fromJson(message, WeatherInfo.class);
			System.out.println(weatherInfo);
			assertEquals(true, message.length() > 0); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(message);
	}

}
