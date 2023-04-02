package com.example.laba1;

public class Calculate {
    public static String eq(String str){
        String[] s = str.split(" ");
        String out = str;
        int a, b;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[2]);
        char par = s[1].charAt(0);
        switch (par) {
            case '+' -> out = String.format(String.valueOf(a + b));
            case '-' -> out = String.valueOf(a - b);
            case 'x' -> out = String.valueOf(a * b);
            case '/' -> {
                if (b != 0) out = String.valueOf((double) a / b).replace('.', ',');
                else out = "Деление на ноль невозможно";
            }
        }
        return out;
    }
}
