package com.example.android1;

import android.util.Log;
import android.widget.Button;

import java.io.Serializable;

public class Calculator implements Serializable {
    public String calculatorTextLog;
    public String currentCalculation;

    public Calculator() {
        this.currentCalculation = "";
        this.calculatorTextLog = "";
    }

    public void setValue(String buttonText) {
        // получаем значение кнопки, которую нажали
        if(buttonText.equals("=")){
            calculateString();
        } else {
            currentCalculation = currentCalculation + buttonText;
        }
    }


    private void calculateString() {
        // расчитываеем результат
        StringToResult stringToResult = new StringToResult();
        //добавляем в текущую строку результат
        float result = stringToResult.make(currentCalculation);
        // текущую строку для вычислений переноси в лог
        calculatorTextLog = calculatorTextLog + "\n" + currentCalculation + "=" + Float.toString(result);
        // обнуляем текушую строку
        currentCalculation = "";
    }
    public String getCalculationView(){
        return calculatorTextLog + "\n" + currentCalculation;
    }
}
