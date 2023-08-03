package com.example.MovieNamesProject.Repository;

import com.example.MovieNamesProject.Entity.MovieNamesProject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieNamesProjectRepository extends CrudRepository<MovieNamesProject,Integer> {
}
