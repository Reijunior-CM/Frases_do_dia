package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    public void gerarF(View view) {

        String[] frases = {
                "frase 1",
                "frase 2",
                "frase 3",
                "frase 4",
                "frase 5"
        };
        int numero = new Random().nextInt(5);
        TextView texto = findViewById(R.id.textView);
        texto.setText( frases[numero]);
    }

}