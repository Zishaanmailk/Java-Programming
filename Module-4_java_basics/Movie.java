public class Movie {
    String title;
    String director;
    int year;

    Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie[title=" + title + ", director=" + director + ", year=" + year + "]";
    }

    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Christopher Nolan", 2010);
        System.out.println(m); 
    }
}
