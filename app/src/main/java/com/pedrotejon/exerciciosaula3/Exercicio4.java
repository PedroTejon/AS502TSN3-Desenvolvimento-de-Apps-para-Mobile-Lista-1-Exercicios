package com.pedrotejon.exerciciosaula3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void criar(View view) {
        LinearLayout checkBoxContainer = findViewById(R.id.checkboxContainer);
        checkBoxContainer.removeAllViews();
        EditText textInput = findViewById(R.id.inpText);

        var text = String.valueOf(textInput.getText());
        for (var i = 0; i < text.length(); i++)
        {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(text.charAt(i)));
            checkBoxContainer.addView(checkBox);
        }
    }
}