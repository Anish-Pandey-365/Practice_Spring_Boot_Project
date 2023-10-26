package com.innoventes.test.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;
     @NotEmpty
	 @Size(min=5)
	private String companyName;
      @Email
	private String email;
    @Positive
	private Integer strength;
	private String webSiteURL;
	@NotEmpty
	@Pattern(regexp = "^(?i)[a-z]{2}[0-9]{2}[EN]$\n",message = "company code pattern is not right")
	private String companyCode;
	//dto changed
}
