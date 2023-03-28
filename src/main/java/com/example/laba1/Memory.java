package com.example.laba1;

import java.io.*;
import java.util.ArrayList;

public class Memory {
    private static final File file = new File("memory.txt");
    public static void toMemory(String str, String result) throws IOException {
        FileWriter to_mem = new FileWriter(file);
        to_mem.write(str+"\\r\\n");
        to_mem.write(result+"\\r\\n");
        to_mem.close();
    }
    public static ArrayList<String> readMemory() throws IOException {
        ArrayList<String> output = new ArrayList<String>();
        FileReader fileReader = new FileReader(file);

        fileReader.close();
        return output;
    }

    public static boolean isEmpty() throws FileNotFoundException {
        return file.length() == 0;
    }
}
