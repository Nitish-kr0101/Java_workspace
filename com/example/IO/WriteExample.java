package com.example.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("My.txt", true)) {
            String content = "Hello how are you?";
            fr.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
