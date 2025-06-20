package com.maj.servicecare.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servicecare")
@CrossOrigin(origins = "*")
public class ServiceCareController {
	@GetMapping
    public void getAllBookings() {
        System.out.println("Get All DATA");
    }
}
