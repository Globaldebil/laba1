package com.example.laba1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class History {
    private static final File file = new File("../files/history.txt");
    public static void toHistory(String str, String result) throws IOException {
        FileWriter to_mem = new FileWriter(file);
        to_mem.write(str+"\\r\\n");
        to_mem.write(result+"\\r\\n");
        to_mem.close();
    }
    public static ArrayList<String> readHistory() {
        ArrayList<String> output = new ArrayList<String>();
        if(file.length() == 0) output.add("Журнала ещё нет");
        else {
            try {
                Scanner s = new Scanner(file);
                while (s.hasNext()) {
                    output.add(s.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return output;
    }

    public static void delete() throws IOException {

    }
}
