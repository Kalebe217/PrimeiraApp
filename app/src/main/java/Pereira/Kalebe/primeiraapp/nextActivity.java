package Pereira.Kalebe.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//método chamado para criar tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2);//cria elementos da tela
        Intent i = getIntent();//obtem a intencao
        String textoDigitado = i.getStringExtra("texto");//obtem string de textView
        TextView tvTexto = findViewById(R.id.tvTexto);//obtem textview
        tvTexto.setText(textoDigitado);//poe no textView a string obtida da intent
    }
}