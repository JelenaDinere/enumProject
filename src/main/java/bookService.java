

import java.util.ArrayList;

public class bookService {
    private ArrayList<Book> bookList = new ArrayList<>();



    public ArrayList<Book> getBooks() {
        return bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);

    }

    public void removeBook(Book book) {
        this.bookList.remove(book);
    }

    public ArrayList<Book> listByTypeFantasy() {
        ArrayList<Book>booksByFantasy = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getGenre().equals(BookGenre.FANTASY)){
                booksByFantasy.add(book);
            }
        }
        return booksByFantasy;
    }

    public ArrayList<Book> listByYearBefore1999() {
        ArrayList<Book>booksBefore1999 = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getYearOfRelease()< 1999){
                booksBefore1999.add(book);
            }
        }
        return booksBefore1999;
    }

    public Book mostExpensive(){
        Book mostExpensive = bookList.get(0);

        for(Book book: bookList){
            if(book.getPrice()> mostExpensive().getPrice()){
                mostExpensive =book;
            }
        }
        return mostExpensive;
    }
    public Book cheapest(){
        Book cheapest = bookList.get(0);

        for(Book book: bookList){
            if(book.getPrice()< cheapest().getPrice()){
                cheapest =book;
            }
        }
        return cheapest;
    }
    public Book bookByThreeAuthors(){
        for (Book book : bookList){
            if(book.getAuthors().size()==3){
                return book;
            }
        }
        return null;
    }

    // verifying a book is on the list
    public Boolean verifyBook(Book book){
        return bookList.contains(book);
    }

    public ArrayList<Book> listOfBookByAuthor(Author provideAuthor) {
        //Array list for storing books that are written by provided author
        ArrayList<Book> authorBooks = new ArrayList<>();
        //Loop through the booklist to find books with the author  in the list of authors
        for(Book book: bookList){
            //Loop through the list of authors to see if provided author is among the list
            for (Author author1:book.getAuthors()){
                if(provideAuthor.equals(author1)){
                    authorBooks.add(book);
                }

            }
        }
        return authorBooks;
    }




}
