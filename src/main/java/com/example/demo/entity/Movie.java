package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private boolean isPopular;

    // Constructors
    public Movie() {
    }

    public Movie(String title, String genre, boolean isPopular) {
        this.title = title;
        this.genre = genre;
        this.isPopular = isPopular;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getIsPopular() {
        return isPopular;
    }

    public void setIsPopular(boolean isPopular) {
        this.isPopular = isPopular;
    }
}
