package com.uuhnaut69.todo.model.payload;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.uuhnaut69.todo.model.enums.WorkStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WorkRequest {

	@NotEmpty(message = "Work name must be not empty")
	private String workName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime startingDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endingDate;

	@Enumerated(EnumType.STRING)
	private WorkStatus workStatus;

}
