package com.learner.learnerProj.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    String name;
    Integer age;

    Address address;
    Long number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


