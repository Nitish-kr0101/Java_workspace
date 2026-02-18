package com.example.controller;

import com.example.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    private List<Laptop> laptopList = new ArrayList<>();

    public LaptopController() {
        initializeLaptops();
    }

    // Initialize sample laptop data
    private void initializeLaptops() {
        laptopList.add(new Laptop(1, "Dell", "XPS 13", 1200.00, "Intel i7"));
        laptopList.add(new Laptop(2, "HP", "Pavilion 15", 650.00, "AMD Ryzen 5"));
        laptopList.add(new Laptop(3, "Apple", "MacBook Air M1", 999.00, "Apple M1"));
        laptopList.add(new Laptop(4, "Lenovo", "ThinkPad X1", 1100.00, "Intel i5"));
    }

    // Retrieve all laptops
    @GetMapping("/list")
    public List<Laptop> getAllLaptops() {
        return laptopList;
    }

    // Retrieve laptop by index
    @GetMapping("/find/{index}")
    public Laptop findLaptop(@PathVariable int index) {
        if (index >= 0 && index < laptopList.size()) {
            return laptopList.get(index);
        }
        return null;
    }

    // Retrieve laptop by ID
    @GetMapping("/findById/{id}")
    public Laptop findLaptopById(@PathVariable long id) {
        return laptopList.stream()
                .filter(laptop -> laptop.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add a new laptop to the list
    @PostMapping("/add")
    public void addLaptop(@RequestBody Laptop laptop) {
        laptopList.add(laptop);
    }

    // Update laptop at specified index
    @PutMapping("/update/{index}")
    public void updateLaptop(@PathVariable int index, @RequestBody Laptop laptop) {
        if (index >= 0 && index < laptopList.size()) {
            laptopList.set(index, laptop);
        }
    }

    // Delete laptop at specified index
    @DeleteMapping("/delete/{index}")
    public void deleteLaptop(@PathVariable int index) {
        if (index >= 0 && index < laptopList.size()) {
            laptopList.remove(index);
        }
    }

    // Delete laptop by ID
    @DeleteMapping("/deleteById/{id}")
    public void deleteLaptopById(@PathVariable long id) {
        laptopList.removeIf(laptop -> laptop.getId() == id);
    }
}
