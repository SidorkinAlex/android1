package com.example.android1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final static String KEY_CALCULATOR = "key_calculator";
    private TextView result;
    private Calculator calculator;
    private ArrayList<Button> buttons;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isPortraitOrientation()) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_landscape);
        }
        initAppClass();

    }

    private void initAppClass() {
        calculator = new Calculator();
        result = findViewById(R.id.calculator);
        initButtons();
    }

    private void initButtons() {
        buttons = new ArrayList<>();
        // создаем массив id для кнопок, что бы вызвать класс обработчик
        int[] buttonIds = {R.id.buttonNumber1, R.id.buttonNumber2, R.id.buttonNumber3, R.id.buttonNumber4,
                R.id.buttonNumber5, R.id.buttonNumber6, R.id.buttonNumber7, R.id.buttonNumber8,
                R.id.buttonNumber9, R.id.buttonNumber0, R.id.bDrop, R.id.bPlus,
                R.id.bMinus, R.id.bEqually, R.id.bMultiply, R.id.bSplit,
                R.id.bSqrt, R.id.bQrt};

        for (int i = 0; i < buttonIds.length; i++) {
            Button b = (Button) findViewById(buttonIds[i]);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String buttonValue = b.getText().toString();
                    calculator.setValue(buttonValue);
                    result.setText(calculator.getCalculationView());
                }
            });
            buttons.add(b);
        }
    }

    private boolean isPortraitOrientation() {
        return getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT;
    }

    // Сохранение данных
    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(KEY_CALCULATOR, calculator);
    }

    // Восстановление данных
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        calculator = (Calculator) instanceState.getSerializable(KEY_CALCULATOR);
        setTextCalculator();
    }

    private void setTextCalculator() {
        result.setText(calculator.getCalculationView());
    }
}