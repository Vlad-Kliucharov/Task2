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
public class Book{
    
  private int id;
  private String name;
  private String author;
  private String publishing_house;
  private int year_publishing;
  
  public Book(int id, String name, String author, String publishing_house, int year_publishing){
      
    this.id = id;
    this.name = name;
    this.author = author;
    this.publishing_house = publishing_house;
    this.year_publishing = year_publishing;
  }
  
  public int getId(){
    return this.id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getAuthor(){
    return this.author;
  }
  
  public void setAuthor(String author){
    this.author = author;
  }
  
  public String getPublishing_house(){
    return this.publishing_house;
  }
  
  public void setPublishing_house(String publishing_house){
    this.publishing_house = publishing_house;
  }
  
  public int getYear_publishing(){
    return this.year_publishing;
  }
  
  public void setYear_publishing(int year_publishing){
    this.year_publishing = year_publishing;
  }
  
  @Override
  public String toString(){
    return "Книга {id=" + this.id + ",Название = " + this.name + ",Автор = " 
            + this.author + ",Издательство = " + this.publishing_house 
            + ",Год издания = " + this.year_publishing + "}";
  }
}
