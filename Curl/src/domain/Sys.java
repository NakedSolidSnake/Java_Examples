package domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys {
	@Expose
	@SerializedName("type") 
	private Integer type;
	
	@Expose
	@SerializedName("id") 
	private Integer id;
	
	@Expose
	@SerializedName("country") 
	private String country;
	
	@Expose
	@SerializedName("sunrise") 
	private Long sunrise;
	
	@Expose
	@SerializedName("sunset") 
	private Long sunset;
}
