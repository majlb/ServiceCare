package com.maj.servicecare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicecare")
@CrossOrigin(origins = "*")
public class BookingController {
/*
    @Autowired
    private BookingRepository bookingRepository;
*/
   /* @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }*/

    /*@GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }*/
	
	@GetMapping
    public void getAllBookings() {
        System.out.println("Get All DATA");
    }
}

