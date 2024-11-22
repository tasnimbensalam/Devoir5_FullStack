package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Album;
import com.example.demo.entities.Chanson;


@RepositoryRestResource(path = "rest")

public interface ChansonRepository extends JpaRepository<Chanson, Long> {
    List<Chanson> findByTitreChanson(String titre);
    List<Chanson> findByTitreChansonContains(String titre);   
    
    @Query("select c from Chanson c where c.titreChanson like %:titre and c.dureeChanson > :duree")
    List<Chanson> findByTitreDuree (@Param("titre") String titre,@Param("duree") Double duree);
    
    @Query("select c from Chanson c where c.album = ?1")
    List<Chanson> findByAlbum(Album album);
    
    List<Chanson> findByAlbumIdAlbum(Long id);
    
    List<Chanson> findByOrderByTitreChansonAsc();
    
    @Query("select c from Chanson c order by c.titreChanson ASC, c.dureeChanson DESC")
    List<Chanson> trierChansonsTitresDuree();
}
