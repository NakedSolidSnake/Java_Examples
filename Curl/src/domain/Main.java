package domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {
	@Expose
	@SerializedName("temp") 
	private Double temperature;
	
	@Expose
	@SerializedName("feels_like") 
	private Double feelsLike;
	
	@Expose
	@SerializedName("temp_min") 
	private Double minimumTemperature;
	
	@Expose
	@SerializedName("temp_max") 
	private Double maximumTemperature;
	
	@Expose
	@SerializedName("pressure") 
	private Integer pressure;
	
	@Expose
	@SerializedName("humidity") 
	private Integer humidity;
}
