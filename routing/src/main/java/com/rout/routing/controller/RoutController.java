package com.rout.routing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rout.routing.service.RoutingService;

@RestController
public class RoutController {
	@Autowired
	private RoutingService routingService;

	@GetMapping("/routing")
	public ResponseEntity<Object> getLandRoutes(@RequestParam String origin, @RequestParam String destination) {

		return new ResponseEntity<>(routingService.route(origin, destination), HttpStatus.OK);
	}

}
