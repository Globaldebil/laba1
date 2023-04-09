package com.example.laba1;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    //Основная строка
    StringBuilder main = new StringBuilder();

    //Подстрока
    StringBuilder sub = new StringBuilder();

    //Объект класса для памяти
    static Memory memory = new Memory();
    private void equalClicked()
    {
        sub.setLength(0);
        sub.append(num.getText());
        main.setLength(0);
        eq = false;
    }
    @FXML
    Button historyBut; //Кропка просмотра истории
    private boolean eq = false, par = false; //Логическая переменная для определения нажата ли кнопка "Равно"
    private boolean dou = false;//Логичечкая переменная для определения целое ли число введено или нет
    @FXML
    private ListView<String> hs;//ListView для показа истории и памяти
    private final List<String> history = FXCollections.observableArrayList();//История

    private final List<String> mem = FXCollections.observableArrayList(); //Память
    @FXML
    AnchorPane blackPane, historyPane; //Панель для затемнения и для вывода пямяти/истории
    @FXML
    Button memClear, memSave, memPlus, memMinus, memRead, memCheck;//Кнопки памяти
    @FXML
    private Label str, num;//Текстовый вывод строки и цифры
     public void makeDisable(){ //Метод включения/выключения кнопок памяти
         memClear.setDisable(memory.isEmpty());
         memRead.setDisable(memory.isEmpty());
         memCheck.setDisable(memory.isEmpty());
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) { //Метод, вызываемый при запуске программы

        blackPane.setVisible(false);

        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(0.1),blackPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

        TranslateTransition translateTransition=new TranslateTransition(Duration.seconds(0.1),historyPane);
        translateTransition.setByY(+300);
        translateTransition.play();

        historyBut.setOnMouseClicked(event -> { //Вызов панели истории
            if(history.size()==0) history.add("Журнала ещё нет");
            hs.setItems((ObservableList<String>) history);
            hs.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            blackPane.setVisible(true);

            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.1),blackPane);
            fadeTransition1.setFromValue(0);
            fadeTransition1.setToValue(0.15);
            fadeTransition1.play();

            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.1),historyPane);
            translateTransition1.setByY(-300);
            translateTransition1.play();
        });

        blackPane.setOnMouseClicked(event -> { //Закрытие панели истории



            FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.1),blackPane);
            fadeTransition1.setFromValue(0.15);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();

            fadeTransition1.setOnFinished(event1 -> blackPane.setVisible(false));


            TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.1),historyPane);
            translateTransition1.setByY(+300);
            translateTransition1.play();
        });
    }

    //--------Равно------------
    @FXML
    public void eq_click() {
         if(par){
            sub.append(num.getText());
            str.setText(sub.toString());
            String out = Calculate.eq(str.getText().replace(',','.'));
            if(out.equals("Деление на ноль невозможно")) num.setFont(Font.font("Segoe UI Semibold",20));
            sub.append(" =");
            num.setText(out);
            main.setLength(0);
            main.append(out);
            str.setText(sub.toString());
            eq = true;
            if(history.size()!=0&&history.get(0).equals("Журнала ещё нет")) history.remove(0);
            history.add(str.getText() + " " + num.getText());
            par = false;
         }
         else {
             sub.append(num.getText()).append(" =");
             str.setText(sub.toString());
             eq = true;
         }
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
        if (!dou){
            if(main.length()!=0)
                main.append(",");
            else
                main.append("0,");
            num.setText(main.toString());
            dou = true;
        }
    }

    //--------Напечатать плюс------------
    @FXML
    public void plusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" + ");
        main.setLength(0);
        str.setText(sub.toString());
        dou = false;
        par = true;
    }

    //--------Напечатать минус------------
    @FXML
    public void minusClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" - ");
        main.setLength(0);
        str.setText(sub.toString());
        dou = false;
        par = true;
    }

    //--------Напечатать умножение------------
    @FXML
    public void proizClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" x ");
        main.setLength(0);
        str.setText(sub.toString());
        dou = false;
        par = true;
    }

    //--------Напечатать деление------------
    @FXML
    public void divClick(){
        if(eq)equalClicked();
        sub.append(main);
        sub.append(" / ");
        main.setLength(0);
        str.setText(sub.toString());
        dou = false;
        par = true;
    }

    //--------отчистить------------
    @FXML
    public void clearClick(){
        dou = false;
        eq = false;
        sub.setLength(0);
        main.setLength(0);
        str.setText("");
        num.setText("0");
        num.setFont(Font.font("Segoe UI Semibold",48));
        par = false;
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
            if(main.charAt(main.length()-1)==',') dou = false;
            main.delete(main.length()-1,main.length());
            num.setText(main.toString());
        }
        else
        {
            main.setLength(0);
            num.setText("0");
        }
    }
    @FXML
    public void memoryClear(){ //Отчистка памяти
        memory.delete();
        makeDisable();
    }
    @FXML
    public void memorySave(){ //Сохранение памяти
        memory.setMemory(num.getText().replace(',','.'));
        makeDisable();
    }
    @FXML
    public void memoryRead(){ //Чтение из памяти
        String mem = memory.getMemory();
        num.setText(mem);
        main.append(mem);
    }

    @FXML
    public void memoryPlus(){//Прибавить к числу из памяти введённое число
        memory.setMemory(String.valueOf(Double.parseDouble(memory.getMemory().replace(',','.'))+Double.parseDouble(num.getText())));
        if(Double.parseDouble(memory.getMemory())%1==0) memory.setMemory(String.valueOf((int)Double.parseDouble(memory.getMemory())));
        makeDisable();

    }
    @FXML
    public void memoryMinus(){//Отнять из числа из памяти введённое число
        memory.setMemory(String.valueOf(
                Double.parseDouble(num.getText().replace(',','.')) - Double.parseDouble(memory.getMemory())
        ));
        if(Double.parseDouble(memory.getMemory())%1==0) memory.setMemory(String.valueOf((int)Double.parseDouble(memory.getMemory())));
        makeDisable();
    }
    public void memoryCheck(){//Проверка памяти
        blackPane.setVisible(true);

        FadeTransition fadeTransition1=new FadeTransition(Duration.seconds(0.1),blackPane);
        fadeTransition1.setFromValue(0);
        fadeTransition1.setToValue(0.15);
        fadeTransition1.play();

        TranslateTransition translateTransition1=new TranslateTransition(Duration.seconds(0.1),historyPane);
        translateTransition1.setByY(-300);
        translateTransition1.play();
        if(mem.size()!=0) mem.remove(0);
        mem.add(memory.getMemory());
        hs.setItems((ObservableList<String>) mem);
    }
}