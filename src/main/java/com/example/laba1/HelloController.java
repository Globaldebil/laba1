package com.example.laba1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.example.laba1.RPNConverter;
import java.io.IOException;

public class HelloController {
    StringBuilder main = new StringBuilder();
    StringBuilder sub = new StringBuilder();
    @FXML
    private Label str, num;
    @FXML
    public void eq_click() throws IOException{
        sub.append(num.getText());
        str.setText(sub.toString());
        String s = RPNConverter.convertToRPN(sub.toString());
        sub.append(" =");
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
        main.append("1");
        num.setText(main.toString());
    }
    @FXML
    public void twoClick(){
        main.append("2");
        num.setText(main.toString());
    }
    @FXML
    public void threeClick(){
        main.append("3");
        num.setText(main.toString());
    }
    @FXML
    public void fourClick(){
        main.append("4");
        num.setText(main.toString());
    }
    @FXML
    public void fiveClick(){
        main.append("5");
        num.setText(main.toString());
    }
    @FXML
    public void sixClick(){
        main.append("6");
        num.setText(main.toString());
    }
    @FXML
    public void sevenClick(){
        main.append("7");
        num.setText(main.toString());
    }
    @FXML
    public void eightClick(){
        main.append("8");
        num.setText(main.toString());
    }
    @FXML
    public void nineClick(){
        main.append("9");
        num.setText(main.toString());
    }
    @FXML
    public void zeroClick(){
        main.append("0");
        num.setText(main.toString());
    }
    @FXML
    public void dotClick(){
        main.append(",");
        num.setText(main.toString());
    }
    @FXML
    public void plusClick(){
        sub.append(main);
        sub.append(" + ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void minusClick(){
        sub.append(main);
        sub.append(" - ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void proizClick(){
        sub.append(main);
        sub.append(" x ");
        main.setLength(0);
        str.setText(sub.toString());
    }
    @FXML
    public void divClick(){
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
        sub.append("sqrt(");
        sub.append(num.getText());
        sub.append(") ");
        str.setText(sub.toString());
        param.sqr(num);
    }
    @FXML
    public void perClick(){
        param.pers(num, str);
    }
    @FXML
    public void powClick(){
        sub.append("sqr(");
        sub.append(num.getText());
        sub.append(") ");
        str.setText(sub.toString());
        param.power(num);
    }
    @FXML
    public void invClick(){
        sub.append("1/(");
        sub.append(num.getText());
        sub.append(") ");
        str.setText(sub.toString());
        param.inverse(num);
    }
    @FXML
    public void delClick(){
        main.delete(main.length()-1,main.length());
        num.setText(main.toString());
    }
}