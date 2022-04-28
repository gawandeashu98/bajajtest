package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
	private boolean status;
	private String user_id;
	private String email;
	private String roll_number;
   private int[] number;
	private String[] alphabates;
}
