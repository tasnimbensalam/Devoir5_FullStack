package com.example.demo.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Album;
import com.example.demo.entities.Chanson;
import com.example.demo.entities.Image;
import com.example.demo.repos.ChansonRepository;
import com.example.demo.repos.ImageRepository;



@Service
public class ChansonServiceImpl implements ChansonService {

	@Autowired
	ChansonRepository chansonRepository;
	
	@Override
	public Chanson saveChanson(Chanson c) {
		return chansonRepository.save(c);
	}
	 @Autowired
	 ImageRepository imageRepository;
	@Override
	public Chanson updateChanson(Chanson c) {
				//Long oldProdImageId =this.getChanson(c.getIdChanson()).getImage().getIdImage();
				//Long newProdImageId = c.getImage().getIdImage();
				Chanson prodUpdated = chansonRepository.save(c);
				//if (oldProdImageId != newProdImageId)
				//imageRepository.deleteById(oldProdImageId);
				return prodUpdated;

		
	}

	@Override
	public void deleteChanson(Chanson c) {
		chansonRepository.delete(c);
	}

	@Override
	public void deleteChansonById(Long id) {
	 Chanson c = getChanson(id);
	 imageRepository.deleteById(id);
	
	chansonRepository.deleteById(id);
	}

	
	
	
	@Override
	public Chanson getChanson(Long id) {
		return chansonRepository.findById(id).get();
	}

	@Override
	public List<Chanson> getAllChansons() {
		return chansonRepository.findAll();
	}
	
	@Override
	public List<Chanson> findByTitreChanson(String titre) {
		return chansonRepository.findByTitreChanson(titre);
	}

	@Override
	public List<Chanson> findByTitreChansonContains(String titre) {
		return chansonRepository.findByTitreChansonContains(titre);
	}

	@Override
	public List<Chanson> findByTitreDuree(String titre, Double duree) {
		return chansonRepository.findByTitreDuree(titre, duree);
	}
	
	@Override
	public List<Chanson> findByAlbum(Album album) {
		return chansonRepository.findByAlbum(album);
	}

	@Override
	public List<Chanson> findByAlbumIdAlbum(Long id) {
		return chansonRepository.findByAlbumIdAlbum(id);
	}

	@Override
	public List<Chanson> findByOrderByTitreChansonAsc() {
		return chansonRepository.findByOrderByTitreChansonAsc();
	}

	@Override
	public List<Chanson> trierChansonsTitresDuree() {
		return chansonRepository.trierChansonsTitresDuree();
	}

}
