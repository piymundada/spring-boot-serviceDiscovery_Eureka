package com.example.movieapp.feign;

import com.example.movieapp.entities.Theatre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="THEATRE-SERVICE")
public interface TheatreServiceClient {

    @GetMapping(value = "${theatreApp.bookMoviePath}")
    Theatre getTheatre(@PathVariable int theatreId, @PathVariable int movieId);

}
