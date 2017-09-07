package br.com.italoqueiroz.escolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoCadastrar = (Button) findViewById(R.id.buttonCadastrar);
        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(cadastrar);
            }
        });

        Button botaoAcessar = (Button) findViewById(R.id.buttonAcessar);
        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessar = new Intent(MainActivity.this, Acessar.class);
                startActivity(acessar);
            }
        });


    }

}
