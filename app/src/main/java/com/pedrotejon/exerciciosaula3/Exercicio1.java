package com.pedrotejon.exerciciosaula3;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verificarIdade(View view) {
        EditText inpNome = findViewById(R.id.inpNome);
        EditText inpIdade = findViewById(R.id.inpIdade);

        var idade = Double.parseDouble(String.valueOf(inpIdade.getText()));
        var nome = inpNome.getText();
        if (idade >= 18) {
            Toast.makeText(this, nome + ", com " + idade + " anos, é menor de idade.", LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(this, nome + ", com " + idade + " anos, é menor de idade.", LENGTH_SHORT)
                    .show();
        }
    }
}