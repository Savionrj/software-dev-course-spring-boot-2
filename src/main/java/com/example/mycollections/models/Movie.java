package com.example.mycollections.models;

public class Movie extends LibraryItem{
    private String director;
    private double rottenTomatoesScore;

    public Movie(String name, String director, int year, double rottenTomatoesScore){
        super(name, year);
        this.director = director;
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRottenTomatoesScore() {
        return rottenTomatoesScore;
    }

    public void setRottenTomatoesScore(double rottenTomatoesScore) {
        this.rottenTomatoesScore = rottenTomatoesScore;
    }

    public String toString() {
        return "name: " + getName() +
                ", director: " + director +
                ", year: " + getYear() +
                ", rotten tomatoes score: " + rottenTomatoesScore +
                '%' + '\n';
    }
}
