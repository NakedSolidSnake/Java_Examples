package domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {
	@Expose
	@SerializedName("id") 
	private Integer id;
	
	@Expose
	@SerializedName("main") 
	private String main;
	
	@Expose
	@SerializedName("description") 
	private String description;
	
	@Expose
	@SerializedName("icon") 
	private String icon;
}
