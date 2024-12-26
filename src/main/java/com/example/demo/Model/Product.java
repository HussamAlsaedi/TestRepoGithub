package com.example.demo.Model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Product {

    @Id
    private Integer employeeID;

    @NotEmpty(message = "name is mandatory")
    @Size(min = 2,max = 10,message = "name characters must be more then 1.")
    private String name;
}
