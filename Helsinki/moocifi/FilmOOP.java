package Helsinki.moocifi;

public class FilmOOP {
    private String name;
    private  int ageRating;

    //constructor
    public FilmOOP(String filmName, int filmAgeRating ){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    //Method to return name
    public String name() {
        return this.name;
    }
    //Returning rating
    public int ageRating() {
        return this.ageRating;
    }

    //Main methd
    public static void main(String[] args) {
        FilmOOP movie1 = new FilmOOP("Inceptiom", 14);
        FilmOOP movie2 = new FilmOOP("Interstellar", 10); 

        System.out.println("Film: " + movie1.name() + ", Age rating: " + movie1.ageRating());
        System.out.println("Film: " + movie2.name() + ", Age rating: " + movie2.ageRating());

    }
}
