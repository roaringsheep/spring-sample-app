package com.juniper.SpringBootInitializr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.juniper.SpringBootInitializr.Models.Trail;
import java.util.List;

public interface TrailDAO extends JpaRepository<Trail, Long> {

    // Jakarta Persistence Query Language (JPQL)
    @Query("Select t From Trail t where name LIKE %:name%")
    List<Trail> findByNameSearch(@Param("name")String name);

    List<Trail> findByNameContainingIgnoreCase(String name);

    List<Trail> findByDescriptionContainsIgnoringCase(String description);
}
