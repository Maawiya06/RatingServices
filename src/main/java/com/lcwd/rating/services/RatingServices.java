package com.lcwd.rating.services;


import com.lcwd.rating.entities.Rating;

import java.util.List;

public interface RatingServices {

    // create
    Rating create(Rating rating);

    // get all rating
    List<Rating> getAllRating();

    // get userId wise rating
    List<Rating> getRatingByUserId(String userId);

    // get hotelId wise rating
    List<Rating> getRatingByHotelId(String hotelId);
}
