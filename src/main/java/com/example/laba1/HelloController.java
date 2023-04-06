package com.example.laba1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.FileNotFoundException;

public class HelloController {
    StringBuilder main = new StringBuilder();
    StringBuilder sub = new StringBuilder();
    private void equalClicked()
    {
        sub.setLength(0);
        sub.append(num.getText());
        main.setLength(0);
        eq = false;
    }
    boolean eq = false;

    @FXML
    public Button memClear;
    @FXML
    private Label str, num;

    //--------Равно------------
    @FXML
    public void eq_click() throws FileNotFoundException {
        sub.append(num.getText());
        str.setText(sub.toString());
        String out = Calculate.eq(str.getText().replace(',','.'));
        sub.append(" =");
        num.setText(out);
        main.setLength(0);
        main.append(out);
        str.setText(sub.toString());
        eq = true;
    }

    //--------Смена знака------------
    @FXML
    public void signClick(){
        int n;
        if(main.length() == 0)n = 0;
        else n = Integer.parseInt(main.toString());
        n *= -1;
        main.setLength(0);
        main.append(n);
        num.setText(main.toString());
    }

    //--------Напечатать 1------------
    @FXML
    public void oneClick(){
        if(eq) {
            equalClicked();
            str.setText("");
        }
        main.append("1");
        num.setText(main.toString());
    }


    //--------Напечатать 2------------
    @FXML
    public void twoClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("2");
        num.setText(main.toString());
    }

    //--------Напечатать 3------------
    @FXML
    public void threeClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("3");
        num.setText(main.toString());
    }

    //--------Напечатать 4------------
    @FXML
    public void fourClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("4");
        num.setText(main.toString());
    }

    //--------Напечатать 5------------
    @FXML
    public void fiveClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("5");
        num.setText(main.toString());
    }

    //--------Напечатать 6------------
    @FXML
    public void sixClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("6");
        num.setText(main.toString());
    }

    //--------Напечатать 7------------
    @FXML
    public void sevenClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("7");
        num.setText(main.toString());
    }

    //--------Напечатать 8------------
    @FXML
    public void eightClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("8");
        num.setText(main.toString());
    }

    //--------Напечатать 9------------
    @FXML
    public void nineClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("9");
        num.setText(main.toString());
    }

    //--------Напечатать 0------------
    @FXML
    public void zeroClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("0");
        num.setText(main.toString());
    }

    //--------Напечатать запятую------------
    @FXML
    public void dotClick(){
        if(main.length()!=0)
            main.append(",");
        else
            main.append("0,");
        num.setText(main.toString());
    }

    //--------Напечатать плюс------------
    @FXML
    public void plusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" + ");
        main.setLength(0);
        str.setText(sub.toString());
    }

    //--------Напечатать минус------------
    @FXML
    public void minusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" - ");
        main.setLength(0);
        str.setText(sub.toString());
    }

    //--------Напечатать умножение------------
    @FXML
    public void proizClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" x ");
        main.setLength(0);
        str.setText(sub.toString());
    }

    //--------Напечатать деление------------
    @FXML
    public void divClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" / ");
        main.setLength(0);
        str.setText(sub.toString());
    }

    //--------Напечатать отчистить------------
    @FXML
    public void clearClick(){
        sub.setLength(0);
        main.setLength(0);
        str.setText("");
        num.setText("0");
    }

    //--------Вычислить корень числа------------
    @FXML
    public void sqrtClick(){
        if(eq)equalClicked();
        str.setText("sqrt("+num.getText()+") ");
        param.sqr(num);
        main.setLength(0);
        main.append(num.getText());
    }

    //--------Вычислить проценты------------
    @FXML
    public void perClick(){
        if(eq)equalClicked();
        param.pers(num, str);
        main.setLength(0);
        main.append(num.getText());
    }

    //--------Вычислить квадрат числа------------
    @FXML
    public void powClick(){
        if(eq)equalClicked();
        str.setText("sqr("+num.getText()+") ");
        param.power(num);
        main.setLength(0);
        main.append(num.getText());
    }

    //--------Найти обратное число------------
    @FXML
    public void invClick(){
        if(eq)equalClicked();
        str.setText("1/("+num.getText()+") ");
        param.inverse(num);
        main.setLength(0);
        main.append(num.getText());
    }

    //--------Удалить один символ------------
    @FXML
    public void delClick(){
        if(eq){
            sub.setLength(0);
            str.setText("");
        }
        if(main.length()>1)
        {
            main.delete(main.length()-1,main.length());
            num.setText(main.toString());
        }
        else
        {
            main.setLength(0);
            num.setText("0");
        }
    }
}