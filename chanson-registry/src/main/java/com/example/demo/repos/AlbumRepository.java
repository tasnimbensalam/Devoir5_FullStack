package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Album;

@RepositoryRestResource(path = "album")
@CrossOrigin("http://localhost:4200/") 
public interface AlbumRepository extends JpaRepository<Album,Long>{

}
