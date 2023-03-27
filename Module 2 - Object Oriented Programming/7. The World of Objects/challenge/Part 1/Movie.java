import javax.xml.transform.Source;

public class Movie {
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie another) {
        this(another.name, another.format, another.rating);
    }

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}

    



