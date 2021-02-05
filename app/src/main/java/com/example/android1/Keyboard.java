package com.example.android1;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Keyboard extends AppCompatActivity {
    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;
    private Button bDrop;
    private Button bPlus;
    private Button bMinus;
    private Button bEqually;
    private Button bMultiply;
    private Button bSplit;
    private Button bSqrt;
    private Button bQrt;

    public void initButton(Calculator calculator) {
        initButtonNumber1(calculator);
        initButtonNumber2(calculator);
        initButtonNumber3(calculator);
        initButtonNumber4(calculator);
        initButtonNumber5(calculator);
        initButtonNumber6(calculator);
        initButtonNumber7(calculator);
        initButtonNumber8(calculator);
        initButtonNumber9(calculator);
        initButtonNumber0(calculator);
        initButtonbDrop(calculator);
        initButtonbPlus(calculator);
        initButtonbMinus(calculator);
        initButtonbEqually(calculator);
        initButtonbMultiply(calculator);
        initButtonbSplit(calculator);
        initButtonbSqrt(calculator);
        initButtonbQrt(calculator);
    }

    private void initButtonNumber1(Calculator calculator) {
        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber1);
            }
        });
    }
    private void initButtonNumber2(Calculator calculator) {
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber2);
            }
        });
    }
    private void initButtonNumber3(Calculator calculator) {
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber3);
            }
        });
    }
    private void initButtonNumber4(Calculator calculator) {
        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber4);
            }
        });
    }
    private void initButtonNumber5(Calculator calculator) {
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber5);
            }
        });
    }
    private void initButtonNumber6(Calculator calculator) {
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber6);
            }
        });
    }
    private void initButtonNumber7(Calculator calculator) {
        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber7);
            }
        });
    }
    private void initButtonNumber8(Calculator calculator) {
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber8);
            }
        });
    }
    private void initButtonNumber9(Calculator calculator) {
        buttonNumber9 = findViewById(R.id.buttonNumber9);
        buttonNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber9);
            }
        });
    }
    private void initButtonNumber0(Calculator calculator) {
        buttonNumber0 = findViewById(R.id.buttonNumber0);
        buttonNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(buttonNumber0);
            }
        });
    }
    private void initButtonbDrop(Calculator calculator) {
        bDrop = findViewById(R.id.bDrop);
        bDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bDrop);
            }
        });
    }
    private void initButtonbPlus(Calculator calculator) {
        bPlus = findViewById(R.id.bPlus);
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bPlus);
            }
        });
    }
    private void initButtonbMinus(Calculator calculator) {
        bMinus = findViewById(R.id.bMinus);
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bMinus);
            }
        });
    }
    private void initButtonbEqually(Calculator calculator) {
        bEqually = findViewById(R.id.bEqually);
        bEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bEqually);
            }
        });
    }
    private void initButtonbMultiply(Calculator calculator) {
        bMultiply = findViewById(R.id.bMultiply);
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bMultiply);
            }
        });
    }
    private void initButtonbSplit(Calculator calculator) {
        bSplit = findViewById(R.id.bSplit);
        bSplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bSplit);
            }
        });
    }
    private void initButtonbSqrt(Calculator calculator) {
        bSqrt = findViewById(R.id.bSqrt);
        bSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bSqrt);
            }
        });
    }
    private void initButtonbQrt(Calculator calculator) {
        bQrt = findViewById(R.id.bQrt);
        bQrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue(bQrt);
            }
        });
    }
}
