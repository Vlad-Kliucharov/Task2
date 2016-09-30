/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task5;

/**
 *
 * @author vladyslav
 */
public class Main
{
  public static void main(String[] args)
  {
    Book[] book = new Book[5];
    
    book[0] = new Book(123, "Философия  ", "Эккель ", "Росинка ", 1990);
    book[1] = new Book(11, "Математика ", "Фикаэлян ", "Росинка ", 1995);
    book[2] = new Book(23, "Химия ", "Кузьмин ", "Росинка ", 1990);
    book[3] = new Book(36, "Алгебра  ", "Фикаэлян ", "Мокко ", 1992);
    book[4] = new Book(144, "Биология ", "Кузин ", "Мокко ", 2005);
    
    System.out.println("Список книг заданного автора ");
    ListOfAuthor(book);
    System.out.println();
    System.out.println("Список книг заданного издательства ");
    ListOfPublishing(book);
    System.out.println();
    System.out.println("Список книг после заданного года ");
    ListOfYear(book);
  }
  
  private static void ListOfAuthor(Book[] books){
    for (Book book : books) {
      if ((book != null) && 
        (book.getAuthor().equals("Фикаэлян "))) {
        System.out.println(book);
      }
    }
  }
  
  private static void ListOfPublishing(Book[] books){
    for (Book book : books) {
      if ((book != null) && 
        (book.getPublishing_house().equals("Росинка "))) {
        System.out.println(book);
      }
    }
  }
  
  private static void ListOfYear(Book[] books){
    for (Book book : books) {
      if ((book != null) && 
        (book.getYear_publishing() >= 1995)) {
        System.out.println(book);
      }
    }
  }
}
