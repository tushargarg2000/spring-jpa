package com.example.tushar.springjparepository.Controllers;

import com.example.tushar.springjparepository.Models.Movie;
import com.example.tushar.springjparepository.Service.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieServices movieServices;

    @GetMapping("get_movies")
    public List<Movie> getAllMovies(){

        return movieServices.getAllMovies();

    }

    @PostMapping("create_movie")
    public void createMovie(@RequestBody()Movie movie){

        movieServices.createMovie(movie);
    }


}
