package com.example.demo.Model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

public class Product {

    @Id
    private Integer employeeID;

    @NotEmpty(message = "name is mandatory")
    @Size(min = 2,max = 10,message = "name characters must be more then 1.")
    private String name;

    @Min(value = 0, message = "Quantity must be greater than or equal to 0")
    private Integer quantity;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private Double price;

    @NotNull(message = "Description cannot be null")
    @Size(max = 100, message = "Description must be less than 100 characters")
    private String description;

    @Min(value = 1, message = "Category ID must be greater than 0")
    private Integer categoryID;

    @Min(value = 1, message = "Warranty ID must be greater than 0")
    private Integer warrantyID;
}
