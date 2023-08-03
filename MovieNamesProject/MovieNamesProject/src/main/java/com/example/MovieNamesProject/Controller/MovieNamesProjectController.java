package com.example.MovieNamesProject.Controller;

import com.example.MovieNamesProject.Entity.MovieNamesProject;
import com.example.MovieNamesProject.Service.MovieNamesProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Controller
@AllArgsConstructor
public class MovieNamesProjectController {

    private MovieNamesProjectService movieNamesProjectService;

    @GetMapping("movies-list")
    public String movieNamesDisplay(ModelMap modelMap){
        Iterable<MovieNamesProject> obj = movieNamesProjectService.fetchMovieDetails();

        List<String> list = new ArrayList<>();

        for(MovieNamesProject a : obj){
            list.add(a.getName());
            //modelMap.put("movie_name",a.getName());
            //System.out.println(a.getName());
        }
        //obj.forEach((Consumer) modelMap.put("movie_name",obj.get(0)));
        //modelMap.put("movie_name",obj);
        modelMap.put("movie_name",list);
        return "movies";

        /*@GetMapping("movies-list")
        public String movieNamesDisplay(ModelMap modelMap){
            Iterable<MovieNames> obj = movieNamesService.fetchMovieDetails();
            modelMap.put("movie_name",obj);
            return "movies";
        }*/

    }


}
