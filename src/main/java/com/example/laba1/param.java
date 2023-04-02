package com.example.laba1;

import javafx.scene.control.Label;

public class param {
    public static void sqr(Label num){
        int n = Integer.parseInt(num.getText());
        num.setText(String.valueOf(Math.sqrt((double) n)).replace('.',','));
    }
    public static void power(Label num){
        int n = Integer.parseInt(num.getText());
        num.setText(String.valueOf((int)Math.pow(n,2)));
    }
    public static void inverse(Label num){
        int n = Integer.parseInt(num.getText());
        if(n!=0)
            num.setText(String.valueOf(Double.valueOf(1/(double)n)).replace('.',','));
        else
            num.setText("Деление на ноль невозможно");
    }
    public static void pers(Label num, Label mainn){
        int n;
        if (mainn.getText().equals(""))
        {
            n = 0;
        }
        else
        {
            String[] a = mainn.getText().split(" ");
            n = Integer.parseInt(a[0]);
        }
        double out = (double) n / 100 * Integer.parseInt(num.getText());
        num.setText(String.valueOf(out).replace('.',','));
    }
}
