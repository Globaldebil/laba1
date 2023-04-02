package com.example.laba1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
    private Label str, num;
    @FXML
    public void eq_click(){
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
    @FXML
    public void signClick(){
        int n = Integer.parseInt(main.toString());
        n *= -1;
        main.setLength(0);
        main.append(n);
        num.setText(main.toString());
    }
    @FXML
    public void oneClick(){
        if(eq) {
            equalClicked();
            str.setText("");
        }
        main.append("1");
        num.setText(main.toString());
    }
    @FXML
    public void twoClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("2");
        num.setText(main.toString());
    }
    @FXML
    public void threeClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("3");
        num.setText(main.toString());
    }
    @FXML
    public void fourClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("4");
        num.setText(main.toString());
    }
    @FXML
    public void fiveClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("5");
        num.setText(main.toString());
    }
    @FXML
    public void sixClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("6");
        num.setText(main.toString());
    }
    @FXML
    public void sevenClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("7");
        num.setText(main.toString());
    }
    @FXML
    public void eightClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("8");
        num.setText(main.toString());
    }
    @FXML
    public void nineClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("9");
        num.setText(main.toString());
    }
    @FXML
    public void zeroClick(){
        if(eq){
            equalClicked();
            str.setText("");
        }
        main.append("0");
        num.setText(main.toString());
    }
    @FXML
    public void dotClick(){
        if(main.length()!=0)
            main.append(",");
        else
            main.append("0,");
        num.setText(main.toString());
    }
    @FXML
    public void plusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" + ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void minusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" - ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void proizClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" x ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void divClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" / ");
        main.setLength(0);
        str.setText(sub.toString());
    }

    @FXML
    public void clearClick(){
        sub.setLength(0);
        main.setLength(0);
        str.setText("");
        num.setText("0");
    }
    @FXML
    public void sqrtClick(){
        if(eq)equalClicked();
        str.setText("sqrt("+num.getText()+") ");
        param.sqr(num);
        main.setLength(0);
        main.append(num.getText());
    }
    @FXML
    public void perClick(){
        if(eq)equalClicked();
        param.pers(num, str);
        main.setLength(0);
        main.append(num.getText());
    }
    @FXML
    public void powClick(){
        if(eq)equalClicked();
        str.setText("sqr("+num.getText()+") ");
        param.power(num);
        main.setLength(0);
        main.append(num.getText());
    }
    @FXML
    public void invClick(){
        if(eq)equalClicked();
        str.setText("1/("+num.getText()+") ");
        param.inverse(num);
        main.setLength(0);
        main.append(num.getText());
    }
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