package domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {
	@Expose
	@SerializedName("speed") 
	private Double speed;
	
	@Expose
	@SerializedName("deg") 
	private Integer deg; 
}
