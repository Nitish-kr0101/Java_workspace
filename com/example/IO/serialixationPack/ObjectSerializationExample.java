package com.example.IO.serialixationPack;

import java.io.*;

public class ObjectSerializationExample {
    public static void main(String[] args) {

        Product prod1 = new Product(1, "TV", 200);

        // Serialization
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("myobject.txt"))) {

            oos.writeObject(prod1);
            System.out.println("Object is serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("myobject.txt"))) {

            System.out.println("Start deserializing....");
            Product prodCopy = (Product) ois.readObject();
            System.out.println(prodCopy);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
