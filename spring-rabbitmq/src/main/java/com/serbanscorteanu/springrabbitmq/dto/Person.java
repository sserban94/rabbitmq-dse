package com.serbanscorteanu.springrabbitmq.dto;

import lombok.Data;

@Data
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Person{");
//        stringBuilder.append("id=").append(id);
//        stringBuilder.append(", firstName='").append(firstName).append('\'');
//        stringBuilder.append(", lastName='").append(lastName).append('\'');
//        stringBuilder.append(", email='").append(email).append('\'');
//        stringBuilder.append('}');
//        return stringBuilder.toString();
//    }
}
