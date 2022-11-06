package dmitry;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	@JsonProperty("id")
	String ID;
	@JsonProperty("first_name")
	String firstName;
	@JsonProperty("email")
	String email;
	@JsonProperty("gender")
	String gender;
	@JsonProperty("course")
	List<Course> course;

	int getGPA() {
		int gpa = 0;
		for (Course c : course) {

			if ("A".equals(c.grade))
				gpa += 4;
			if ("B".equals(c.grade))
				gpa += 3;
			if ("C".equals(c.grade))
				gpa += 2;
			if ("D".equals(c.grade))
				gpa += 1;

		}
		return gpa;
	}


}
