package com.lcwd.rating.controller;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingServices ratingServices;

    // create
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.create(rating));
    }

    // get all
    public ResponseEntity<List<Rating>> getAllRating(){
        return ResponseEntity.ok(ratingServices.getAllRating());
    }

    // get userId wise rating
    public ResponseEntity<List<Rating>> getRatingByUserId(String userId){
        return ResponseEntity.ok(ratingServices.getRatingByUserId(userId));
    }

    // get hotelId wise rating
    public ResponseEntity<List<Rating>> getRatingByHotelId(String hotelId){
        return ResponseEntity.ok(ratingServices.getRatingByHotelId(hotelId));
    }
}
