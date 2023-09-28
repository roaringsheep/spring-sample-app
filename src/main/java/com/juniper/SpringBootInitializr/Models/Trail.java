package com.juniper.SpringBootInitializr.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "trails")
public class Trail {

    @Id
    @Column(name = "trail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    
    private String description;
    
    public Trail() { }

    public Trail(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Trail [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
