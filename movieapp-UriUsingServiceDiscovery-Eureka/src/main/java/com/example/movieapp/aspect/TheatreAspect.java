package com.example.movieapp.aspect;

import com.example.movieapp.entities.Movie;
import com.example.movieapp.entities.Theatre;
import com.example.movieapp.entities.User;
import com.example.movieapp.feign.TheatreServiceClient;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TheatreAspect {

    @Autowired
    private TheatreServiceClient theatreServiceClient;

    @Before(value = "execution(* com.example.movieapp.services.MovieServiceImpl.bookMovie(..)) and args(user, movie, theatre)")
    public void beforeAdvice(JoinPoint joinPoint, User user, Movie movie, Theatre theatre){
        Theatre receivedTheatre = theatreServiceClient.getTheatre(theatre.getTheatreId(), theatre.getMovieId());
        if (receivedTheatre ==null){
            throw new RuntimeException("No theatre movie combination is not found");
        }
    }
}
















