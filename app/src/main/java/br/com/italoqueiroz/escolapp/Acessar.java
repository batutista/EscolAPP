package br.com.italoqueiroz.escolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acessar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acessar);

        Button botaoMapas = (Button) findViewById(R.id.buttonMapas);
        botaoMapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapas = new Intent(Acessar.this, Mapas.class);
                startActivity(mapas);
            }
        });
    }
}
