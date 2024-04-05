package com.songon.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.songon.model.GenreModel;
import com.songon.model.SongModel;
import com.songon.repo.SongRepo;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SongController {

    @Autowired
    SongRepo songRepo;
    // Method to retrieve all songs
    @GetMapping("/songs")
    @ResponseBody
    public List<SongModel> getSongs() {
        List<SongModel> songs = songRepo.findAll();

        return songs;
    }
    @GetMapping("/songs/{id}")
    public List<SongModel> getSongById(@PathVariable int id){
    	
    	 Optional<SongModel> optionalSong = songRepo.findById(id);
    	 if(optionalSong.isPresent()) {
    		 return Collections.singletonList(optionalSong.get());
    	 }
    	 else {
			return Collections.emptyList();
		}
    }
    
    @GetMapping("/with-artists")
    public List<SongModel> getSongsWithArtists() {
        return songRepo.findAllWithArtists();
    }
    
    @GetMapping("/by-artist/{artistId}")
    public List<SongModel> getSongsByArtistId(@PathVariable int artistId){
    	return songRepo.findSongsByArtistId(artistId);
    }
    
	@GetMapping("/by-genre/{genre_id}")
	public List<SongModel> getSongByGenreId(@PathVariable int genre_id){
		return songRepo.findSongsByGenreId(genre_id);
		
	}
    
 

    // Method to handle file upload
    @PostMapping("/uploadSong")
    @ResponseBody
    public SongModel uploadSong(@RequestBody SongModel songModel) {
    	songRepo.save(songModel);
    	return songModel;
    }
}
