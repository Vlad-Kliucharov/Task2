/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7;

/**
 *
 * @author vladyslav
 */
public class Phone {

    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int city_calls;
    private int international_calls;

    public Phone(int id, String name, String patronymic, String surname,
            String address, int city_calls, int international_calls) {
            
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.city_calls = city_calls;
        this.international_calls = international_calls;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCity_calls() {
        return this.city_calls;
    }

    public void setCity_calls(int city_calls) {
        this.city_calls = city_calls;
    }

    public int getInternational_calls() {
        return this.international_calls;
    }

    public void setInternational_calls(int international_calls) {
        this.international_calls = international_calls;
    }

    @Override
    public String toString() {
        return "Абонент {id = " + this.id + ",Имя = " + this.name + ",Отчество = " 
                + this.patronymic + ",Фамилия = " + this.surname + ",Адрес = "
                + this.address + ",Городские звонки = " + this.city_calls
                + ",Междугородние звонки = " + this.international_calls + "}";
    }
}
