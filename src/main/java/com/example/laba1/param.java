package com.example.laba1;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
//Класс параметров
public class param
{
    //Параметр нахождения квадратного корня
    public static void sqr(Label num){
        double n = Double.parseDouble(num.getText().replace(',','.'));
        if(n>=0){
            if (Math.sqrt(n)%1==0)
                num.setText(String.valueOf((long)Math.sqrt(n)));
            else
                num.setText(String.valueOf(Math.sqrt(n)).replace('.',','));
        }
        else{
            num.setFont(Font.font("Segoe UI Semibold",20));
            num.setText("Неверный ввод");
        }
    }
    //Параметр нахождения квадрата числа
    public static void power(Label num){
        double n = Double.parseDouble(num.getText().replace(',','.'));

        if (n%1==0)
            num.setText(String.valueOf((long)Math.pow(n,2)));
        else
            num.setText(String.valueOf(Math.pow(n,2)).replace('.',','));
    }
    //Параметр нахождения обратного числа
    public static void inverse(Label num){
        double n = Double.parseDouble(num.getText().replace(',','.'));
        if(n!=0)
            if ((1/n)%1!=0) { num.setText(String.valueOf(1/n).replace('.',',')); }
            else { num.setText(String.valueOf((long)(1/n))); }
        else{
            num.setText("Деление на ноль невозможно");
            num.setFont(Font.font("Segoe UI Semibold",20));
        }
    }
    //Параметр нахождения процента
    public static void pers(Label num, Label mainn){
        double n;
        if (mainn.getText().equals(""))
        {
            n = 0;
        }
        else
        {
            String[] a = mainn.getText().split(" ");
            n = Double.parseDouble(a[0].replace(',','.'));
        }
        double out = n / 100 * Double.parseDouble(num.getText());
        if(out%1==0)  num.setText(String.valueOf((long)out).replace('.',','));
        else  num.setText(String.valueOf(out).replace('.',','));
    }
}
