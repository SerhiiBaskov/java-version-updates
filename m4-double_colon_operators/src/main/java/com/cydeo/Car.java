package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }
}
