package com.dmodi;
import java.util.Collections;
import java.util.List;

//API layer for Persisting and retrieving the Book objects.
public class BookDAL {
  private static BookDAL bookDAL = new BookDAL();

  public List<Book> getAllBooks(){
      return Collections.EMPTY_LIST;
  }

  public Book getBook(String isbn){
	  System.out.println("Returning nulllllllllll");
      return null;
  }

  public String addBook(Book book){  //Define for adding new Book
      return book.getIsbn();
  }

  public String updateBook(Book book){
      return book.getIsbn();
  }

  public static BookDAL getInstance(){
      return bookDAL;
  }
}