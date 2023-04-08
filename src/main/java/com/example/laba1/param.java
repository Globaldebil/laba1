package com.example.laba1;

import javafx.scene.control.Label;

public class param {
    public static void sqr(Label num){
        double n = Double.parseDouble(num.getText());
        if(n>=0)
            num.setText(String.valueOf(Math.sqrt(n)).replace('.',','));
        else
            num.setText("Неверный ввод");
    }
    public static void power(Label num){
        double n = Double.parseDouble(num.getText());
        num.setText(String.valueOf((int)Math.pow(n,2)));
    }
    public static void inverse(Label num){
        double n = Double.parseDouble(num.getText());
        if(n!=0)
            num.setText(String.valueOf(Double.valueOf(1/n)).replace('.',','));
        else
            num.setText("Деление на ноль невозможно");
    }
    public static void pers(Label num, Label mainn){
        double n;
        if (mainn.getText().equals(""))
        {
            n = 0;
        }
        else
        {
            String[] a = mainn.getText().split(" ");
            n = Double.parseDouble(a[0]);
        }
        double out = n / 100 * Double.parseDouble(num.getText());
        num.setText(String.valueOf(out).replace('.',','));
    }
}
