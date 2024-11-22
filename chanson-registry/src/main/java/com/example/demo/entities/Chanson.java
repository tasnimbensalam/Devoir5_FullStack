package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Chanson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChanson;
    private String titreChanson;
    private Double dureeChanson;
    //private String imagePath;
  /*  @OneToOne
    private Image image;*/

    @OneToMany(mappedBy = "chanson")
    private List<Image> images;

    @ManyToOne
    private Album album;

    public Chanson() {
        super();
    }

  

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Chanson(String titreChanson, Double dureeChanson) {
        super();
        this.titreChanson = titreChanson;
        this.dureeChanson = dureeChanson;
    }

    public Long getIdChanson() {
        return idChanson;
    }

    public void setIdChanson(Long idChanson) {
        this.idChanson = idChanson;
    }

    public String getTitreChanson() {
        return titreChanson;
    }

    public void setTitreChanson(String titreChanson) {
        this.titreChanson = titreChanson;
    }

    public Double getDureeChanson() {
        return dureeChanson;
    }

    public void setDureeChanson(Double dureeChanson) {
        this.dureeChanson = dureeChanson;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Chanson [idChanson=" + idChanson + ", titreChanson=" + titreChanson + ", dureeChanson=" + dureeChanson
                + ", album=" + album + "]";
    }
    
   
}
