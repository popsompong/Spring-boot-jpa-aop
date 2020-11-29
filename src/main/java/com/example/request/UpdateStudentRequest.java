package com.example.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateStudentRequest {
	
	@NotNull(message = "Student Id is required")
	private Long id;
	
	@JsonProperty("first_name")
	private String firstName;

	private String lastName;

	private String email;

}
