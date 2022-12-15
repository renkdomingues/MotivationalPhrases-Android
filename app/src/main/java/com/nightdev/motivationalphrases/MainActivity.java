package com.nightdev.motivationalphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtvFrases;
    private Button btnGerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvFrases = findViewById(R.id.txtvFrases);
        btnGerarFrases = findViewById(R.id.btnGerarFrase);

        getSupportActionBar().hide();

        btnGerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] lstFrases = {
                        "Na vida um monte de gente sabe o que fazer, mas poucos fazem, de fato, o que sabem que é preciso.Saber não é o suficiente. Você precisa agir",
                        "Saiba que são suas decisões, e não suas condições, que determinam seu destino",
                        "Se você faz o que sempre fez, você obterá o que você sempre obteve",
                        "É nos momentos de decisão que o seu destino é traçado",
                        "Onde há foco a energia flui"
                };

                Random random = new Random();
                int randomNumber = random.nextInt(lstFrases.length);

                txtvFrases.setText(lstFrases[randomNumber]);

            }
        });
    }
}