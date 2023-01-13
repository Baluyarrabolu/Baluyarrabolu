package com.balu.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto {

	@NotBlank(message="empty not allowed")
	@NotNull(message="name is null")
	@Size(min=3,max=16,message="Name must be within 3 to 16 char")
	private String name;
	
	@NotBlank(message="empty not allowed")
	@NotNull(message="address is null")
	@Size(min=3,max=20,message="address must be within 3 to 20 char")
	private String address;
}
