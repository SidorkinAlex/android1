package com.example.android1;

import android.util.Log;
import android.widget.Button;

import java.io.Serializable;

public class Calculator implements Serializable {
    public String calculatorText;

    public Calculator() {
        this.calculatorText = " ";
    }

    public void setValue(Button button) {
        // получаем значение кнопки, которую нажали
        String buttonText = button.getText().toString();
        calculatorText = calculatorText + buttonText;
        // присвоение значения счетчику

    }
}
