package org.example;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String address;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(email, person.email);
    }
@Override
public int hashCode() {
        return Objects.hash(name, address, email);
        }

@Override
public int compareTo(Person o) {
        return this.name.compareTo(o.name);
        }

public String getSummary(){
        return name + "," + age + "," + address;
        }

public boolean isAdult(){
        return age >= 18;
        }

    public void sendEmail(String message){
        System.out.println("Send email: " + message);
    }
}