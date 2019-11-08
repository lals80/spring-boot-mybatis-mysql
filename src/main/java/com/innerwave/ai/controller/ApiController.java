package com.innerwave.ai.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innerwave.ai.domain.BoardDomain;

@RestController
public class ApiController {
	@Autowired
	private BoardDomain boarddomain;

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return String.format("%s %s", boarddomain.selectName(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
}
