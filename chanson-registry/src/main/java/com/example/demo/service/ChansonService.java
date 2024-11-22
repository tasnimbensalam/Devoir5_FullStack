package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Album;
import com.example.demo.entities.Chanson;


public interface ChansonService {
	
	 Chanson saveChanson(Chanson c);
	 Chanson updateChanson(Chanson c);
	 void deleteChanson(Chanson c);
     void deleteChansonById(Long id);
	 Chanson getChanson(Long id);
	 List<Chanson> getAllChansons();
	 
	 List<Chanson> findByTitreChanson(String titre);
	 List<Chanson> findByTitreChansonContains(String titre);
	 List<Chanson> findByTitreDuree (String titre, Double duree);
	 List<Chanson> findByAlbum (Album album);
	 List<Chanson> findByAlbumIdAlbum(Long id);
	 List<Chanson> findByOrderByTitreChansonAsc();
	 List<Chanson> trierChansonsTitresDuree();
}
