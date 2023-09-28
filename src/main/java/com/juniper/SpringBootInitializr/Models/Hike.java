package com.juniper.SpringBootInitializr.Models;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "hikes")
public class Hike {
    @Id
    @Column(name = "hike_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime date;
    
    @Column(nullable = false)
    private String name;
    
    private String notes;
    
    public Hike() { }

    public Hike(long id, LocalDateTime date, String name, String notes) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
}
