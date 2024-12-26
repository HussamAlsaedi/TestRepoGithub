package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Admin {

    @Id
    private Long id;

    private String name;
}
