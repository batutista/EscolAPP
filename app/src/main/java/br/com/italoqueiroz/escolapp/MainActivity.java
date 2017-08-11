package br.com.italoqueiroz.escolapp;

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

        Button x = (Button) findViewById(R.id.buttonCadastrar);
    }
    public void executarCadastrar(View paramentro){
        Toast.makeText(this, "Ola mundo", Toast.LENGTH_LONG);
    }
}
