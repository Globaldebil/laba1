package com.example.laba1;

public class Calculate {
    public static String eq(String str) {
        String[] s = str.split(" ");
        String out = str;
        if (str.length() < 3) out = "0";
        else {
            double a, b;
            a = Double.parseDouble(s[0]);
            b = Double.parseDouble(s[2]);
            char par = s[1].charAt(0);
            switch (par) {
                case '+' -> out = ((a+b)%1==0.0) ? String.format(String.valueOf(Integer.valueOf((int) (a + b)))): String.format(String.valueOf(a + b)).replace('.', ',');
                case '-' -> out = ((a-b)%1==0) ? String.format(String.valueOf(Integer.valueOf((int) (a - b)))): String.valueOf(a - b).replace('.', ',');
                case 'x' -> out = ((a*b)%1==0) ? String.format(String.valueOf(Integer.valueOf((int) (a * b)))): String.valueOf(a * b).replace('.', ',');
                case '/' -> {
                    if (b != 0) out = ((a/b)%1==0) ? String.valueOf( (int)(a / b)): String.valueOf( a / b).replace('.', ',');
                    else out = "Деление на ноль невозможно";
                }
            }
        }
        return out;
    }
}