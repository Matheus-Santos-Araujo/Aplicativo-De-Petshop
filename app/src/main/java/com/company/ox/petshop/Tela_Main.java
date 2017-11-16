package com.company.ox.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Tela_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_main);


        Button entrar = (Button) findViewById(R.id.BTentrar1);

        entrar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Main.this,Tela_Login.class);
                 startActivity(intent);
                Toast.makeText(Tela_Main.this, "Indo para Login...", Toast.LENGTH_LONG).show();
            }

        });
        Button cadastrar = (Button) findViewById(R.id.BTcadastro1);

        cadastrar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Main.this,Tela_Cadastro.class);
                startActivity(intent);
                Toast.makeText(Tela_Main.this, "Indo para Cadastro...", Toast.LENGTH_SHORT).show();
            }

        });
        Button deescricao = (Button) findViewById(R.id.BTdeescricao);
        deescricao.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Main.this,Tela_Deescricao.class);
                startActivity(intent);
                Toast.makeText(Tela_Main.this, "Quem somos nós...", Toast.LENGTH_SHORT).show();

            }

        });

    }
}
