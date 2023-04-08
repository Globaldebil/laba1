package com.example.laba1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class History {
    private static final File file = new File("../files/history.txt");
    public static void toHistory(String num) throws IOException {
        FileWriter to_mem = new FileWriter(file);
        to_mem.write(num+"\\r\\n");
        to_mem.close();
    }
    public static ArrayList<String> readHistory(){
        ArrayList<String> output = new ArrayList<String>();
        try {
            Scanner s = new Scanner(file);
            while (s.hasNext()){
                output.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static boolean isEmpty() throws FileNotFoundException {
        return file.length() == 0;
    }
    public static void ArrayToFile(ArrayList<String> list) throws IOException{
        FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file);
        delete();
        fr.close();
        fw.close();
    }
    public static void delete() throws IOException {
        file.delete();
        file.createNewFile();
    }
}
