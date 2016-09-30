/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author vladyslav
 */
public class Customer{
 
  private int id;
  private String name;
  private String surname;
  private String patronymic;
  private String address;
  private long creditCardNumber;
  private String accountNumber;
  
 public Customer(int id,String name, String surname, String patronymic, 
         String address,long creditCardNumber,String accountNumber){
  
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.address = address;
    this.creditCardNumber = creditCardNumber;
    this.accountNumber = accountNumber;
  }
 
  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
  
  
  @Override
  public String toString(){
    return "Покупатель {id=" + this.id + ", Имя = " + this.name + ", Фамилия = " 
            + this.surname + ", Адресс = " + this.address + ", Номер кредитки = " 
            + this.creditCardNumber + ", Номер счета=" + this.accountNumber + '}';
  }
}
