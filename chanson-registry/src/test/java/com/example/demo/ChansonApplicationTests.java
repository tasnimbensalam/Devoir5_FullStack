package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Album;
import com.example.demo.entities.Chanson;
import com.example.demo.repos.ChansonRepository;


@SpringBootTest
class ChansonApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private ChansonRepository chansonRepository;

	
	
	@Test
	public void testFindChanson() {
		Chanson c = chansonRepository.findById(1L).get();		  
		System.out.println(c);
	}

	@Test
	public void testUpdateChanson() {
		Chanson c = chansonRepository.findById(1L).get();
		c.setDureeChanson(4.00);
		chansonRepository.save(c);
	}
	
	@Test
	public void testDeleteChanson() {
		chansonRepository.deleteById(1L);
	}

	@Test
	public void testListerToutesChansons() {
		List<Chanson> chansons = chansonRepository.findAll();	 
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByTitreChanson() {
		List<Chanson> chansons = chansonRepository.findByTitreChanson("Song A");
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByTitreChansonContains() {
		List<Chanson> chansons = chansonRepository.findByTitreChansonContains("Song");
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}
	
	@Test
	public void testFindByTitreDuree() {
		List<Chanson> chansons = chansonRepository.findByTitreDuree("Song A", 3.00);
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByAlbum() {
		Album album = new Album();
		album.setIdAlbum(1L);			
		List<Chanson> chansons = chansonRepository.findByAlbum(album);
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}
	
	@Test
	public void testFindByAlbumIdAlbum() {			
		List<Chanson> chansons = chansonRepository.findByAlbumIdAlbum(1L);
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

	@Test
	public void testFindByOrderByTitreChansonAsc() {
		List<Chanson> chansons = chansonRepository.findByOrderByTitreChansonAsc();	 
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

	@Test
	public void testTrierChansonsTitresDuree() {
		List<Chanson> chansons = chansonRepository.trierChansonsTitresDuree();	 
		for (Chanson c : chansons) {
			System.out.println(c);
		}
	}

}
