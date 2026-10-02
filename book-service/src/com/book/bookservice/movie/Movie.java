package com.book.bookservice.movie;

public class Movie {

    public int movieId;
    public String movieName;
    public String hero;
    public double rating;
    public int ticketPrice;


    @Override
    public boolean equals(Object obj){

        Movie movie= (Movie) obj;

        if(this.movieId==movie.movieId &&
                this.movieName.equals(movie.movieName) &&
                this.hero.equals(movie.hero) &&
                this.rating==movie.rating &&
                this.ticketPrice==movie.ticketPrice){

            return true;

        }
        return false;
    }
}
