package com.example.movieapp.dao;

import com.example.movieapp.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * This layer will be used to talk to the databases
 */
public interface MovieDao extends JpaRepository<Movie, Integer> {

}
