package io.demo.RatingService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.demo.RatingService.model.Rating;
import io.demo.RatingService.model.UserRating;


@RestController
@RequestMapping("/ratingdata")
public class RatingDataResources {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId")String movieId)
	{
		return new Rating(movieId,4);
	}
	
	
	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId")String userId)
	{
		List<Rating> ratings = Arrays.asList(new Rating("1234",4),new Rating("3456",8));
		UserRating userrating = new UserRating();
		userrating.setUserrating(ratings);
		return userrating;
		
	}
	
}
