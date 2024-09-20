package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin(origins = "*") // Allows requests from any origin
    @GetMapping("/popular")
    public List<Movie> getPopularMovies() {
        return movieService.getPopularMovies();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/genre/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }
}
