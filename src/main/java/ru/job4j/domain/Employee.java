package ru.job4j.domain;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Employee {

    private int id;

    private String firstname;

    private String lastname;

    private String inn;

    private Timestamp hired;

    private List<Person> persons;

    public static Employee of(int id, String firstname, String lastname, String inn, List<Person> persons) {
        Employee employee = new Employee();
        employee.id = id;
        employee.firstname = firstname;
        employee.lastname = lastname;
        employee.inn = inn;
        employee.persons = persons;
        employee.hired = Timestamp.valueOf(LocalDateTime.of(2022, 3, 15, 10, 10));
        return employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Timestamp getHired() {
        return hired;
    }

    public void setHired(Timestamp hired) {
        this.hired = hired;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
