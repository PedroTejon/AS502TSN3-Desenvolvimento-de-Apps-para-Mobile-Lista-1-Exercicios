package com.pedrotejon.exerciciosaula3;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio2 extends AppCompatActivity {

    private EditText inpNum1;
    private EditText inpNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void somar(View view) {
        EditText inpNum1 = findViewById(R.id.inpNum1);
        EditText inpNum2 = findViewById(R.id.inpNum2);

        var num1 = Double.parseDouble(String.valueOf(inpNum1.getText()));
        var num2 = Double.parseDouble(String.valueOf(inpNum2.getText()));

        Toast.makeText(this, Double.toString(num1 + num2), LENGTH_SHORT)
                .show();
    }

    public void subtrair(View view) {
        EditText inpNum1 = findViewById(R.id.inpNum1);
        EditText inpNum2 = findViewById(R.id.inpNum2);

        var num1 = Double.parseDouble(String.valueOf(inpNum1.getText()));
        var num2 = Double.parseDouble(String.valueOf(inpNum2.getText()));

        Toast.makeText(this, Double.toString(num1 - num2), LENGTH_SHORT)
                .show();
    }

    public void multiplicar(View view) {
        EditText inpNum1 = findViewById(R.id.inpNum1);
        EditText inpNum2 = findViewById(R.id.inpNum2);

        var num1 = Double.parseDouble(String.valueOf(inpNum1.getText()));
        var num2 = Double.parseDouble(String.valueOf(inpNum2.getText()));

        Toast.makeText(this, Double.toString(num1 * num2), LENGTH_SHORT)
                .show();
    }

    public void dividir(View view) {
        EditText inpNum1 = findViewById(R.id.inpNum1);
        EditText inpNum2 = findViewById(R.id.inpNum2);

        var num1 = Double.parseDouble(String.valueOf(inpNum1.getText()));
        var num2 = Double.parseDouble(String.valueOf(inpNum2.getText()));

        Toast.makeText(this, Double.toString(num1 / num2), LENGTH_SHORT)
                .show();
    }
}