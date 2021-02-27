package domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coordinates {
	@Expose
	@SerializedName("lat") 
	private Double latitude;
	
	@Expose
	@SerializedName("lon") 
	private Double longitude;
}
