package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Laptop model class with Lombok annotations for automatic generation
 * of getters, setters, toString, equals, and hashCode methods
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //laptop table will be created
public class Laptop {
    @Id //to make id as primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private double price;
    private String processor;
}

