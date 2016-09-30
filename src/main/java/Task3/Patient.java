/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

/**
 *
 * @author vladyslav
 */
public class Patient
{
  private int id;
  private String surname;
  private String name;
  private String patronymic;
  private String address;
  private String phoneNumber;
  private int numberMedicalCard;
  private String diagnosis;
  
  public Patient(int id, String surname, String name, String patronymic, 
          String address, String phoneNumber, int numberMedicalCard, String diagnosis){
      
    this.id = id;
    this.surname = surname;
    this.name = name;
    this.patronymic = patronymic;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.numberMedicalCard = numberMedicalCard;
    this.diagnosis = diagnosis;
  }
  
  public int getId(){
    return this.id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public String getSurname(){
    return this.surname;
  }
  
  public void setSurname(String surname){
    this.surname = surname;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getPatronymic(){
    return this.patronymic;
  }
  
  public void setPatronymic(String patronymic){
    this.patronymic = patronymic;
  }
  
  public String getAddress(){
    return this.address;
  }
  
  public void setAddress(String address){
    this.address = address;
  }
  
  public String getPhoneNumber(){
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  
  public int getNumberMedicalCard(){
    return this.numberMedicalCard;
  }
  
  public void setNumberMedicalCard(int numberMedicalCard){
    this.numberMedicalCard = numberMedicalCard;
  }
  
  public String getDiagnosis(){
    return this.diagnosis;
  }
  
  public void setDiagnosis(String diagnosis){
    this.diagnosis = diagnosis;
  }
  
  @Override
  public String toString(){
    return "Пациент {id=" + this.id + ",Имя = " + this.name + ", Фамилия = " 
            + this.surname + ", Отчество = " + this.patronymic + ", Адресс = " 
            + this.address + ", Номер телефона =" + this.phoneNumber + ", Номер мед карты =" 
            + this.numberMedicalCard + ", Диагноз = " + this.diagnosis + "}";
  }
}
