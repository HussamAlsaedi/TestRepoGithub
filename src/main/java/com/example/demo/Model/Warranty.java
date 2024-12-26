package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Warranty {

    @Id
    private Integer warrantyID;

    @NotNull(message = "Product ID cannot be null")
    @Positive(message = "Product ID must be a positive number")
    private Integer productID;

    @NotNull(message = "Vendor ID cannot be null")
    @Positive(message = "Vendor ID must be a positive number")
    private Integer vendorID;

    @NotNull(message = "Product serial number cannot be null")
    @Size(min = 3, max = 100, message = "Product serial number must be between 3 and 100 characters")
    private String productSerialNumber;

    @NotNull(message = "Warranty period cannot be null")
     private LocalDate warrantyPeriod;
}
