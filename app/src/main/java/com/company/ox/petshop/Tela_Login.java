package com.company.ox.petshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Tela_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        Button cadastro2 = (Button) findViewById(R.id.BTcadastro);

        cadastro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Login.this,Tela_Cadastro.class);
                startActivity(intent);
                Toast.makeText(Tela_Login.this, "Indo para Cadastro...", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
