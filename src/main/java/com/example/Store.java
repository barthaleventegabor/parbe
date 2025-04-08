package com.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Store {

    public static void writeCars(String content) {
        try {
            tryWriteCars(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void tryWriteCars(String content) throws IOException {
        FileWriter fw = new FileWriter(new File("cars.csv"));
        fw.write(content);
        fw.close();

    }
}
