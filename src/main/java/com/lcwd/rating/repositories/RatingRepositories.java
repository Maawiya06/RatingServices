package com.lcwd.rating.repositories;

import com.lcwd.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepositories extends MongoRepository<Rating, String> {
}
