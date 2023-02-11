package com.example.theatre.services;

import com.example.theatre.entities.Theatre;

public interface TheatreService {
    public Theatre getTheatreDetails(int theatreId, int movieId);
}
