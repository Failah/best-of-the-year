package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.classes.Movie;
import com.example.demo.classes.Song;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/movies")
	public String showMovies(Model m) {
		List<Movie> movies = getBestMovies();
		m.addAttribute("movies", movies);
		return "movies";
	}

	@GetMapping("/songs")
	public String showSongs(Model model) {
		List<Song> songs = getBestSongs();
		model.addAttribute("songs", songs);
		return "songs";
	}

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();

		Movie movie1 = new Movie(1, "Titolo del film 1");
		movies.add(movie1);
		Movie movie2 = new Movie(2, "Titolo del film 2");
		movies.add(movie2);
		Movie movie3 = new Movie(3, "Titolo del film 3");
		movies.add(movie3);

		return movies;
	}

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();

		Song song1 = new Song(1, "Titolo della canzone 1");
		songs.add(song1);
		Song song2 = new Song(2, "Titolo della canzone 2");
		songs.add(song2);
		Song song3 = new Song(3, "Titolo della canzone 3");
		songs.add(song3);

		return songs;
	}
}
