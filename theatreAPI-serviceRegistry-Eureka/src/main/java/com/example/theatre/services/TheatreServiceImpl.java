package com.example.theatre.services;

import com.example.theatre.entities.Theatre;
import com.example.theatre.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreServiceImpl implements TheatreService{

    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public Theatre getTheatreDetails(int theatreId, int movieId) {
        Theatre requestedTheatre = theatreRepository.findByTheatreIdAndMovieId(theatreId, movieId);

        if(requestedTheatre!=null)
            return requestedTheatre;
        return null;
    }
}
