package Pereira.Kalebe.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// tela inicial do app
public class MainActivity extends AppCompatActivity {

    //ao abrir tela, o metodo onCreate sera invocado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //cria os elementos de interface criados nos arquivos xml
        setContentView(R.layout.activity_main);



        //encontra/obtem o botao da tela atraves o id
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //cria detector de click para o click no botao e ativa metodo onclick caso o botao seja acionado
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//acionado ao clicar o botao
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this, nextActivity.class);
                i.putExtra("texto",textoDigitado);
                startActivity(i);
            }
        });
    }
}