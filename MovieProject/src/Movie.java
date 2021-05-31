import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public static Movie[] getPG(Movie[] movieArray){
        List<Movie> pgMovies=new ArrayList<Movie>();

        for(int i=0;i<movieArray.length;i++){
            if(movieArray[i].rating.contains("PG")){
                pgMovies.add(movieArray[i]);
            }
        }
        return pgMovies.toArray(new Movie[0]);
    }

    public static void main(String[] args){

        Movie[] movieDetails;

        Movie movie1=new Movie("Casino Royale","Eon Productions","PG-13");
        Movie movie2=new Movie("Interstellar","Paramount");
        Movie movie3=new Movie ("Inception","Legendary Pictures","R");
        movieDetails=new Movie[]{movie1,movie2,movie3};

        Movie[] pgMovies=getPG(movieDetails);

        for(int i=0;i<pgMovies.length;i++){
            System.out.println(pgMovies[i].title);
        }



    }
}
