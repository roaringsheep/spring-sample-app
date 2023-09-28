package com.juniper.SpringBootInitializr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.juniper.SpringBootInitializr.Models.Hike;
import java.util.List;



public interface HikeDAO extends JpaRepository<Hike, Long> {
    
    // @Query("Select h From h where h.name like %name%")
    List<Hike> findByName(String name);
}
