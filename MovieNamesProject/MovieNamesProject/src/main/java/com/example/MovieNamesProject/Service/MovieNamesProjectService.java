package com.example.MovieNamesProject.Service;

import com.example.MovieNamesProject.Entity.MovieNamesProject;
import com.example.MovieNamesProject.Repository.MovieNamesProjectRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieNamesProjectService {

    private final MovieNamesProjectRepository movieNamesProjectRepository;
    public void MovieDetails(){
        movieNamesProjectRepository.save(new MovieNamesProject(1,"Bro"));
        movieNamesProjectRepository.save(new MovieNamesProject(2,"Baby"));
    }

    public void saveMovieDetails(){}
    public Iterable<MovieNamesProject> fetchMovieDetails(){
        for(MovieNamesProject obj : movieNamesProjectRepository.findAll()){
            System.out.println(obj.getName());
        }
        return movieNamesProjectRepository.findAll();
    }


}
