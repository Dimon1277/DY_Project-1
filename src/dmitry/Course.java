package dmitry;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
	@JsonProperty("courseNo")
	String courseNo;
	@JsonProperty("grade")
	String grade;
	@JsonProperty("creditHours")
	int creditHours;
}
