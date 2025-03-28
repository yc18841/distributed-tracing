package com.chen.grandchildservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chen.grandchildservice.service.GcService;

import io.micrometer.observation.annotation.Observed;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class GrandchildController {
	@Autowired
	GcService service;

	@GetMapping("/grandchild")
	@Observed(name = "user.name", contextualName = "Grandchild-->service", lowCardinalityKeyValues = { "userType",
			"userType2" })
	public String sayHi() {
		log.info("Grandchild was called ...");
		return service.createHi();

	}
}
