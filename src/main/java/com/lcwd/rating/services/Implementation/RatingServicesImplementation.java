package com.lcwd.rating.services.Implementation;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repositories.RatingRepositories;
import com.lcwd.rating.services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingServicesImplementation implements RatingServices {

    @Autowired
    private RatingRepositories ratingRepositories;


    @Override
    public Rating create(Rating rating) {
        return ratingRepositories.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepositories.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepositories.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepositories.findByHotelId(hotelId);
    }
}
