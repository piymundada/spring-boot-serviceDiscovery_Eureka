package com.example.theatre.repository;

import com.example.theatre.entities.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Integer> {
    public Theatre findByTheatreIdAndMovieId(int theatreId,int movieId);
}
