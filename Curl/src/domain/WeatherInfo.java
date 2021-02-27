package domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherInfo {
	@Expose
	@SerializedName("coord") 
	private Coordinates coordinates;
	
	@Expose
	@SerializedName("weather")
	private List<Weather> weather;
	
	@Expose
	@SerializedName("base")
	private String base;
	
	@Expose
	@SerializedName("main")
	private Main main;
	
	@Expose
	@SerializedName("visibility")
	private Integer visibility;
	
	@Expose
	@SerializedName("wind")
	private Wind wind;
	
	@Expose
	@SerializedName("clouds")
	private Clouds clouds;
	
	@Expose
	@SerializedName("dt")
	private Long dt;
	
	@Expose
	@SerializedName("sys")
	private Sys sys;
	
	@Expose
	@SerializedName("timezone")
	private Long timezone;
	
	@Expose
	@SerializedName("id")
	private Integer id;
	
	@Expose
	@SerializedName("name")
	private String name;
	
	@Expose
	@SerializedName("cod")
	private Integer cod;
	
	public WeatherInfo() {
		coordinates = new Coordinates();
		weather = new ArrayList<Weather>();
		main = new Main();
		clouds = new Clouds();
		sys = new Sys();
	}
	
	
}
