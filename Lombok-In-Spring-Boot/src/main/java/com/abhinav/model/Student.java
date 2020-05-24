package com.abhinav.model;

import java.io.Serializable;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data			// Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	//@JsonProperty(required = true)
	private String sid;
	
	//@JsonProperty(required = true)
	private String sname;
	
	//@JsonProperty(required = true)
	private String sage;
	
}
