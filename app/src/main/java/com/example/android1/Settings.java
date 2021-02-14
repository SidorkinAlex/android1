package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Settings extends AppCompatActivity {
    private SharedPreferences mSettings;
    final String THEME_SETTINGS_NAME = "theme_app";
    RadioButton black_button;
    RadioButton white_button;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initView();
        initThemeButton();
    }

    private void initView() {
        mSettings = getSharedPreferences(THEME_SETTINGS_NAME, Context.MODE_PRIVATE);
        white_button = findViewById(R.id.white_button);
        white_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putString(THEME_SETTINGS_NAME, "white");
                editor.apply();
                img.setImageResource(R.drawable.white_exemple);
            }
        });

        black_button = findViewById(R.id.black_button);
        black_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putString(THEME_SETTINGS_NAME, "black");
                editor.apply();
                img.setImageResource(R.drawable.black_exemple);
            }
        });
        img = findViewById(R.id.theme_img);
    }

    private void initThemeButton() {
        if(mSettings.contains("theme_app")){
            String theme_name = mSettings.getString("theme_app","");
            setCheckedButton(theme_name);
        } else {
            initDefaultLayout();
        }
    }

    private void initDefaultLayout() {
        // оекряем тему инициализируем img и ставим рабиобатонн
    }

    private void setCheckedButton(String theme_name) {
        switch (theme_name){
            case "white":
                white_button.setChecked(true);
                img.setImageResource(R.drawable.white_exemple);
                break;
            case "black":
                black_button.setChecked(true);
                img.setImageResource(R.drawable.black_exemple);
                break;
        }
    }
}