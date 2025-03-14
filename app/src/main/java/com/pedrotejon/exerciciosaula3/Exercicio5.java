package com.pedrotejon.exerciciosaula3;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Exercicio5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void salvarPreferencias(View view) {
        CheckBox chkNotif = findViewById(R.id.chkReceberNotificacoes);
        CheckBox chkDark = findViewById(R.id.chkModoEscuro);
        CheckBox chkLogin = findViewById(R.id.chkLembrarLogin);

        ArrayList<String> preferencias = new ArrayList<String>();
        if (chkNotif.isChecked()) {
            preferencias.add(String.valueOf(chkNotif.getText()));
        }
        if (chkDark.isChecked()) {
            preferencias.add(String.valueOf(chkDark.getText()));
        }
        if (chkLogin.isChecked()) {
            preferencias.add(String.valueOf(chkLogin.getText()));
        }

        if (preferencias.isEmpty()){
            Toast.makeText(this, "Nenhuma preferência foi escolhida", LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(this, "Preferências Salvas: " + String.join("; ", preferencias), LENGTH_SHORT)
                    .show();
        }
    }
}