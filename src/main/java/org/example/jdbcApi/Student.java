package org.example.jdbcApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private String gender;
    private Double gpa;


}
