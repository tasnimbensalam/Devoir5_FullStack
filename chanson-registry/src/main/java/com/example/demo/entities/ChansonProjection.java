package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="titreChanson",types= {Chanson.class})
public interface ChansonProjection {
public String getTitreChanson();

}
