package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class MainController {
    List<String> list = new ArrayList<>();
    public MainController()
    {
        list.add("Nitish");
        list.add("Navi");
        list.add("Rohit");
        list.add("Dhoni");
    }
    //@RequestMapping("/list")
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
//    public List<String> getList()
//    {
//        return list;
//    }
    @GetMapping("/list")
    public List<String> list()
    {
        return list;
    }
    @GetMapping("/find/{index}")
    public String find(@PathVariable int index)
    {
        return list.get(index);
    }
    @PostMapping("/add")
    public void add(@RequestBody String name)
    {
        //list.add("kk");
        list.add(name);
    }
    //find index then update the body
    @PutMapping("/update/{index}")
    public void update(@PathVariable int index,@RequestBody String name)
    {        list.set(index,name);
    }
//    @PutMapping("/update")
//    public void update()
//    {
//        list.set(3,"Vaibhav");
//    }
    //find index then delete the body
    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index)
    {
        list.remove(index);
    }

}
