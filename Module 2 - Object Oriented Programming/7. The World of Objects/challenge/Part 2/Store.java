public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
        // TODO
    }

    public Movie getMovie(int index) {
        // TODO 

        return this.movies[index];
    }

    public void setMovie(int index, Movie movie) {
        // TODO 
        this.movies[index] = movie;
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
