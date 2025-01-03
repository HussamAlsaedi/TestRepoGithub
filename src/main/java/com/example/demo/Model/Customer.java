package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Customer {

    @Id
    private Long id;

    @NotEmpty(message = "name is mandatory")
    @Size(min = 2,max = 10,message = "name characters must be more then 1.")
    private String name;

}
