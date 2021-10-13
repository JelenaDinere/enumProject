import java.util.ArrayList;

public class Book {
    private String title;
    private int price;
    private int yearOfRelease;
    private BookGenre genre;
    private ArrayList<Author>authors;


Book(String title,int price,BookGenre genre,int yearOfRelease){
    this.title =title;
    this.price =price;
    this.genre = genre;
    this.yearOfRelease =yearOfRelease;
    this.authors = new ArrayList<>();
}

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public BookGenre getGenre() {
        return genre;
    }
}
