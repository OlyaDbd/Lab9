package com.bsu;

public class TennisPlayer {
    private String name;
    private int rating;
    private String country;

    public TennisPlayer(String name, int rating, String country) {
        this.name = name;
        this.rating = rating;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "TennisPlayers{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", country='" + country + '\'' +
                '}';
    }
}
